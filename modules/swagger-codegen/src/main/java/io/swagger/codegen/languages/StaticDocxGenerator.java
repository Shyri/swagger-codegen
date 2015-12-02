package io.swagger.codegen.languages;

import io.swagger.codegen.CodegenConfig;
import io.swagger.codegen.CodegenType;
import io.swagger.codegen.DefaultCodegen;
import io.swagger.codegen.SupportingFile;

/**
 * Created by Shyri on 01/12/2015.
 */
public class StaticDocxGenerator extends DefaultCodegen implements CodegenConfig {
    private static final String ALL_OPERATIONS = "";
    protected String invokerPackage = "io.swagger.client";
    protected String groupId = "io.swagger";
    protected String artifactId = "swagger-client";
    protected String artifactVersion = "1.0.0";
    protected String sourceFolder = "src/main/scala";

    public StaticDocxGenerator() {
        super();
        outputFolder = "docx";
        embeddedTemplateDir = templateDir = "docx";

        supportingFiles.add(new SupportingFile("rels.mustache", "_rels", ".rels"));

        supportingFiles.add(new SupportingFile("app.mustache", "docProps", "app.xml"));
        supportingFiles.add(new SupportingFile("core.mustache", "docProps", "core.xml"));

        supportingFiles.add(new SupportingFile("theme.mustache", "word/theme", "theme1.xml"));
        supportingFiles.add(new SupportingFile("document.rels.mustache", "word/_rels", "theme1.xml"));

        supportingFiles.add(new SupportingFile("webSettings.mustache", "word", "webSettings.xml"));
        supportingFiles.add(new SupportingFile("styles.mustache", "word", "styles.xml"));
        supportingFiles.add(new SupportingFile("settings.mustache", "word", "settings.xml"));
        supportingFiles.add(new SupportingFile("footnotes.mustache", "word", "footnotes.xml"));
        supportingFiles.add(new SupportingFile("fontTable.mustache", "word", "fontTable.xml"));
        supportingFiles.add(new SupportingFile("endnotes.mustache", "word", "endnotes.xml"));
        supportingFiles.add(new SupportingFile("document.mustache", "word", "document.xml"));
        supportingFiles.add(new SupportingFile("[Content_Types].mustache", "", "[Content_Types].xml"));
    }

    @Override
    public CodegenType getTag() {
        return CodegenType.DOCUMENTATION;
    }

    @Override
    public String getName() {
        return "docx";
    }

    @Override
    public String getHelp() {
        return "Generates a static docx file.";
    }
}
