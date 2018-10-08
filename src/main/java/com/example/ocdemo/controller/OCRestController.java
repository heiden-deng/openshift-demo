package com.example.ocdemo.controller;


/*import com.openshift.restclient.ClientBuilder;
import com.openshift.restclient.IClient;
import com.openshift.restclient.IResourceFactory;
import com.openshift.restclient.ResourceKind;
import com.openshift.restclient.model.IPod;
import com.openshift.restclient.model.IService;
import com.openshift.restclient.model.template.ITemplate;*/
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OCRestController {

    /*@GetMapping(value = "/test/pods")
    public String PrintPods(){
        StringBuilder sb = new StringBuilder();
        IClient client = new ClientBuilder("https://openshift-1:8443")
                .withUserName("jq.deng")
                .withPassword("123456")
                .build();
        IResourceFactory rf = client.getResourceFactory();
        IService service = rf.stub(ResourceKind.SERVICE,"test","test");

        List<IPod> pods = service.getPods();
        for (IPod pod : pods){
            sb.append(pod.getHost() + ":" + pod.getIP() + " : " + pod.getName() + '\n');
        }

        System.out.println("template ................");
        ITemplate template = rf.stub(ResourceKind.TEMPLATE,"test");
        sb.append("template ................" + template.getObjects().toString());
        //Collection<IResource> resources = template.getName();
		*//*for (IResource resource : resources) {
			System.out.println(resource.getName() + ":" + resource.getKind());
		}*//*
		return sb.toString();
    }*/
}
