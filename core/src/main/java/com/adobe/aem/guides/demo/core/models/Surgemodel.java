package com.adobe.aem.guides.demo.core.models;

import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Surgemodel {
    @ValueMapValue
    private String text;
    @ValueMapValue
    private String path;
    @ChildResource
    private List<Surge>multifield;
    @ValueMapValue
    private String checkbox;

    public String getText() {
        return text;
    }
    public String getPath() {
        return path;
    }
    public List<Surge> getMultifield() {
        return multifield;
    }
    public String getCheckbox() {
        return checkbox;
    }
    

}
