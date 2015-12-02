package io.swagger.codegen.staticDocx;

import io.swagger.codegen.AbstractOptionsTest;
import io.swagger.codegen.CodegenConfig;
import io.swagger.codegen.languages.StaticDocxGenerator;
import io.swagger.codegen.options.StaticDocxOptionsProvider;
import mockit.Expectations;
import mockit.Tested;

/**
 * Created by Shyri on 01/12/2015.
 */
public class StaticDocxOptionsTest extends AbstractOptionsTest {

    @Tested
    private StaticDocxGenerator clientCodegen;

    public StaticDocxOptionsTest() {
        super(new StaticDocxOptionsProvider());
    }

    @Override
    protected CodegenConfig getCodegenConfig() {
        return clientCodegen;
    }

    @Override
    protected void setExpectations() {
        new Expectations(clientCodegen) {{
            clientCodegen.setModelPackage(StaticDocxOptionsProvider.MODEL_PACKAGE_VALUE);
            times = 1;
            clientCodegen.setApiPackage(StaticDocxOptionsProvider.API_PACKAGE_VALUE);
            times = 1;
            clientCodegen.setSortParamsByRequiredFlag(Boolean.valueOf(StaticDocxOptionsProvider.SORT_PARAMS_VALUE));
            times = 1;
        }};
    }
}
