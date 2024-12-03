package com.adobe.aem.guides.demo.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Vamsi {
    @ValueMapValue
    private String text;
    @ValueMapValue
    private String path;
    @ChildResource
    private String[] next;
    public String getText() {
        return text;
    }
    public String getPath() {
        return path;
    }
    public String[] getNext() {
        return next;
    }
    

}
