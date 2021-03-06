/*
 * *© Copyright 2018 - 2020 Visa. All Rights Reserved.**
 *
 * NOTICE: The software and accompanying information and documentation (together, the “Software”) remain the property of and are proprietary to Visa and its suppliers and affiliates. The Software remains protected by intellectual property rights and may be covered by U.S. and foreign patents or patent applications. The Software is licensed and not sold.*
 *
 *  By accessing the Software you are agreeing to Visa's terms of use (developer.visa.com/terms) and privacy policy (developer.visa.com/privacy).In addition, all permissible uses of the Software must be in support of Visa products, programs and services provided through the Visa Developer Program (VDP) platform only (developer.visa.com). **THE SOFTWARE AND ANY ASSOCIATED INFORMATION OR DOCUMENTATION IS PROVIDED ON AN “AS IS,” “AS AVAILABLE,” “WITH ALL FAULTS” BASIS WITHOUT WARRANTY OR  CONDITION OF ANY KIND. YOUR USE IS AT YOUR OWN RISK.** All brand names are the property of their respective owners, used for identification purposes only, and do not imply product endorsement or affiliation with Visa. Any links to third party sites are for your information only and equally  do not constitute a Visa endorsement. Visa has no insight into and control over third party content and code and disclaims all liability for any such components, including continued availability and functionality. Benefits depend on implementation details and business factors and coding steps shown are exemplary only and do not reflect all necessary elements for the described capabilities. Capabilities and features are subject to Visa’s terms and conditions and may require development,implementation and resources by you based on your business and operational details. Please refer to the specific API documentation for details on the requirements, eligibility and geographic availability.*
 *
 * This Software includes programs, concepts and details under continuing development by Visa. Any Visa features,functionality, implementation, branding, and schedules may be amended, updated or canceled at Visa’s discretion.The timing of widespread availability of programs and functionality is also subject to a number of factors outside Visa’s control,including but not limited to deployment of necessary infrastructure by issuers, acquirers, merchants and mobile device manufacturers.*
 *
 */

/*
 * Funds Transfer API
 * The Funds Transfer API can pull funds from the sender&apos;s Visa account (in preparation for pushing funds to a recipient&apos;s account) in an Account Funding Transaction (AFT).  Additionally, the Funds Transfer API also provides functionality to push funds to the recipient&apos;s Visa account in an Original Credit Transaction (OCT).  If a transaction is declined, the Funds Transfer API can also return the funds to the sender&apos;s funding source in an Account Funding Transaction Reversal (AFTR). The API has been enhanced to allow originators to send their PushFundsTransactions(OCTs) and PullFundsTransactions(AFTs) to Visa for routing to multiple U.S. debit networks.
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.visa.developer.sample.funds_transfer_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * MagneticStripeData
 */
public class MagneticStripeData {


    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("track1Data")
    private String track1Data = null;


    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("track2Data")
    private String track2Data = null;

    public MagneticStripeData track1Data(String track1Data) {
        this.track1Data = track1Data;
        return this;
    }


    /**
     * &lt;b&gt;Conditional (see Note)&lt;/b&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; For a cardPresent scenario, magneticStripeData.track1Data (or magneticStripeData.track2Data) must be included.&lt;br&gt;&lt;br&gt;&lt;b&gt;Note:&lt;/b&gt; These fields are only available in OCT transactions in specific geographies. Please reach out to your Visa representative for details
     *
     * @return track1Data
     **/
    @ApiModelProperty(value = "<b>Conditional (see Note)</b><br><br><b>Note:</b> For a cardPresent scenario, magneticStripeData.track1Data (or magneticStripeData.track2Data) must be included.<br><br><b>Note:</b> These fields are only available in OCT transactions in specific geographies. Please reach out to your Visa representative for details")
    public String getTrack1Data() {
        return track1Data;
    }

    public void setTrack1Data(String track1Data) {
        this.track1Data = track1Data;
    }

    public MagneticStripeData track2Data(String track2Data) {
        this.track2Data = track2Data;
        return this;
    }


    /**
     * &lt;b&gt;Note:&lt;/b&gt; For a CardPresent scenario, MagneticStripeData.track1Data (or MagneticStripeData.track2Data) must be included.
     *
     * @return track2Data
     **/
    @ApiModelProperty(value = "<b>Note:</b> For a CardPresent scenario, MagneticStripeData.track1Data (or MagneticStripeData.track2Data) must be included.")
    public String getTrack2Data() {
        return track2Data;
    }

    public void setTrack2Data(String track2Data) {
        this.track2Data = track2Data;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MagneticStripeData magneticStripeData = (MagneticStripeData) o;
        return Objects.equals(this.track1Data, magneticStripeData.track1Data) &&
                Objects.equals(this.track2Data, magneticStripeData.track2Data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(track1Data, track2Data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MagneticStripeData {\n");

        sb.append("    track1Data: ").append(toIndentedString(track1Data)).append("\n");
        sb.append("    track2Data: ").append(toIndentedString(track2Data)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }


}



