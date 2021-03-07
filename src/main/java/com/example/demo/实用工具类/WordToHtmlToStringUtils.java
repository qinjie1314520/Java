package com.example.demo.实用工具类;

import fr.opensagres.poi.xwpf.converter.core.BasicURIResolver;
import fr.opensagres.poi.xwpf.converter.core.FileImageExtractor;
import fr.opensagres.poi.xwpf.converter.xhtml.XHTMLConverter;
import fr.opensagres.poi.xwpf.converter.xhtml.XHTMLOptions;
import fr.opensagres.xdocreport.utils.StringUtils;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.converter.WordToHtmlConverter;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
  * word转位html
  *
  * @author: qinjie
 **/
public class WordToHtmlToStringUtils {
    /**
     * docx to html
     *
     * @param in 输入流
     * @return
     * @throws IOException
     */
    private static InputStream docxToHtml(InputStream in, String filePath) {
        XWPFDocument document = null;
        try {
            document = new XWPFDocument(in);
            XHTMLOptions options = XHTMLOptions.create();
            options.setIgnoreStylesIfUnused(false);
            options.setFragment(true);
            filePath = filePath+"image"+File.separator;
            options.setExtractor(new FileImageExtractor(new File(filePath)));
            options.URIResolver(new BasicURIResolver("image"));
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            XHTMLConverter.getInstance().convert(document, out, options);
            return new ByteArrayInputStream(out.toByteArray());
        } catch (IOException e) {
        }
        return in;
    }

    /**
     * doc to html
     *
     * @param in
     * @return
     * @throws Exception
     */
    private static InputStream docToHtml(InputStream in) {
        try {
            HWPFDocument wordDocument = new HWPFDocument(in);
            WordToHtmlConverter wordToHtmlConverter = new WordToHtmlConverter(
                    DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument());
            wordToHtmlConverter.processDocument(wordDocument);
            Document htmlDocument = wordToHtmlConverter.getDocument();
            ByteArrayOutputStream outStream = new ByteArrayOutputStream();
            DOMSource domSource = new DOMSource(htmlDocument);
            StreamResult streamResult = new StreamResult(outStream);
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer serializer = factory.newTransformer();
            serializer.setOutputProperty(OutputKeys.ENCODING, "utf-8");
            serializer.setOutputProperty(OutputKeys.INDENT, "yes");
            serializer.setOutputProperty(OutputKeys.METHOD, "html");
            serializer.transform(domSource, streamResult);
            outStream.close();
            return new ByteArrayInputStream(outStream.toByteArray());
        } catch (Exception e) {
        }
        return in;
    }

    private static InputStream docToHtml(Map<String, Object> request, InputStream in) {
        String fileName = (String) request.get("name");
        if (StringUtils.isEmpty(fileName)) {
            return in;
        }
        String extensionName = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length());
        String prevName = fileName.substring(0, fileName.lastIndexOf("."));
        if ("html".equalsIgnoreCase(extensionName)) {
            return in;
        }
        if (extensionName.equalsIgnoreCase("doc")) {
            request.put("name", prevName + ".html");
            return docToHtml(in);
        }
        if (extensionName.equalsIgnoreCase("docx")) {
            request.put("name", prevName + ".html");
            return docxToHtml(in, (String)request.get("filePath"));
        }
        return in;
    }

    private static void inputStreamToFile(InputStream inputStream, String newPath) {
        OutputStream outputStream = null;
        try {
            File file = new File(newPath);
            outputStream = new FileOutputStream(file);

            int bytesWritten = 0;
            int byteCount = 0;

            byte[] bytes = new byte[1024];

            while ((byteCount = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, bytesWritten, byteCount);
            }

            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }


    public static String WordToHtmlToString(String fileName,String filePath) throws Exception {
        Map<String, Object> request = new HashMap<String, Object>();
        request.put("name", fileName);
        request.put("filePath", filePath);
        InputStream in = new FileInputStream(filePath + fileName);// 读取文件的数据。
        InputStream inputStream = docToHtml(request, in);
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) != -1) {
            result.write(buffer, 0, length);
        }
        return result.toString("UTF-8");
    }
    public static void main(String[] args) {
        try {
            System.out.println(WordToHtmlToStringUtils.WordToHtmlToString("1.docx", "G:\\"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

