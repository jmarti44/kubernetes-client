
package io.fabric8.openshift.api.model.machineconfig.v1;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.builder.Editable;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "kind",
    "metadata",
    "bundleFile",
    "notAfter",
    "notBefore",
    "signer",
    "subject"
})
@ToString
@EqualsAndHashCode
@Setter
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class)
})
@Generated("jsonschema2pojo")
public class ControllerCertificate implements Editable<ControllerCertificateBuilder> , KubernetesResource
{

    @JsonProperty("bundleFile")
    private String bundleFile;
    @JsonProperty("notAfter")
    private String notAfter;
    @JsonProperty("notBefore")
    private String notBefore;
    @JsonProperty("signer")
    private String signer;
    @JsonProperty("subject")
    private String subject;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ControllerCertificate() {
    }

    public ControllerCertificate(String bundleFile, String notAfter, String notBefore, String signer, String subject) {
        super();
        this.bundleFile = bundleFile;
        this.notAfter = notAfter;
        this.notBefore = notBefore;
        this.signer = signer;
        this.subject = subject;
    }

    @JsonProperty("bundleFile")
    public String getBundleFile() {
        return bundleFile;
    }

    @JsonProperty("bundleFile")
    public void setBundleFile(String bundleFile) {
        this.bundleFile = bundleFile;
    }

    @JsonProperty("notAfter")
    public String getNotAfter() {
        return notAfter;
    }

    @JsonProperty("notAfter")
    public void setNotAfter(String notAfter) {
        this.notAfter = notAfter;
    }

    @JsonProperty("notBefore")
    public String getNotBefore() {
        return notBefore;
    }

    @JsonProperty("notBefore")
    public void setNotBefore(String notBefore) {
        this.notBefore = notBefore;
    }

    @JsonProperty("signer")
    public String getSigner() {
        return signer;
    }

    @JsonProperty("signer")
    public void setSigner(String signer) {
        this.signer = signer;
    }

    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    @JsonProperty("subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @JsonIgnore
    public ControllerCertificateBuilder edit() {
        return new ControllerCertificateBuilder(this);
    }

    @JsonIgnore
    public ControllerCertificateBuilder toBuilder() {
        return edit();
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
