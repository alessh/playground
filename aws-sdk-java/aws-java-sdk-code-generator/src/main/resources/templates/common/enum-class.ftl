<@LicenseCommentBlockMacro.content />

package ${metadata.packageName}.model;

/**
 * <#if shape.documentation?has_content>${shape.documentation}</#if>
 */
<#if shape.deprecated>
@Deprecated
</#if>
public enum ${shape.shapeName} {

<#assign enums = shape.enums/>

<#list enums as enum>
    ${enum.name}("${enum.value}")<#if enum_has_next>,<#else>;</#if>
</#list>

    private String value;

    private ${shape.shapeName}(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return ${shape.shapeName} corresponding to the value
     */
    public static ${shape.shapeName} fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        <#list enums as enum>
        } else if ("${enum.value}".equals(value)) {
            return ${enum.name};
        </#list>
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}