<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'feedbackM2W.label', default: 'FeedbackM2W')}" />
        <title><g:message code="default.edit.label" args="[entityName]" /></title>
    </head>
    <body>
        <a href="#edit-feedbackM2W" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div class="nav" role="navigation">
            <ul>
                <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
                <li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
                <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
            </ul>
        </div>
        <div id="edit-feedbackM2W" class="content scaffold-edit" role="main">
            <h1><g:message code="default.edit.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${this.feedbackM2W}">
            <ul class="errors" role="alert">
                <g:eachError bean="${this.feedbackM2W}" var="error">
                <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
                </g:eachError>
            </ul>
            </g:hasErrors>
            <g:form resource="${this.feedbackM2W}" method="PUT">
                <g:hiddenField name="version" value="${this.feedbackM2W?.version}" />
                <fieldset class="form">
                    <f:all bean="feedbackM2W" except="firstImpression, firstImpressionSpecifics, stoodOut, stoodOutSpecifics, style, styleSpecifics,
                    howISpoke, howISpokeSpecifics, vibe, vibeSpecifics, positiveFirstImpression, firstImpressionChange, whatIntriguedYouAboutMe,
                    raiseAnyFlags, raiseAnyFlagsSpecifics, wannaGoOutAgain, contact" />
                    <div class="fieldcontain">
                        <label for="firstImpression">First Impressions</label>
                        <span class="required-indicator">*</span>
                        <input type="hidden" name="_firstImpression">
                        <g:select name="firstImpression" from="${com.speeddating.FeedbackM2W.FirstImpression.values()}" optionKey="key" multiple="true" value="${feedbackM2W?.firstImpression}"/>
                    </div>
                    <div class="fieldcontain">
                        <label for="stoodOut">First Impressions Specifics</label>
                        <g:textArea name="firstImpressionSpecifics" value="${feedbackM2W?.firstImpressionSpecifics}"  />
                    </div>
                    <div class="fieldcontain">
                        <label for="stoodOut">Stood Out</label>
                        <span class="required-indicator">*</span>
                        <input type="hidden" name="_stoodOut">
                        <g:select name="stoodOut" from="${com.speeddating.FeedbackM2W.StoodOut.values()}" optionKey="key" multiple="true" value="${feedbackM2W?.stoodOut}" />
                    </div>
                    <div class="fieldcontain">
                        <label for="stoodOut">Stood Out Specifics</label>
                        <g:textArea name="stoodOutSpecifics" value="${feedbackM2W?.stoodOutSpecifics}" />
                    </div>
                    <div class="fieldcontain">
                        <label for="style">Style</label>
                        <span class="required-indicator">*</span>
                        <input type="hidden" name="_style">
                        <g:select name="style" from="${com.speeddating.FeedbackM2W.Style.values()}" optionKey="key" multiple="true" value="${feedbackM2W?.style}" />
                    </div>
                    <div class="fieldcontain">
                        <label for="stoodOut">Style Specifics</label>
                        <g:textArea name="styleSpecifics" value="${feedbackM2W?.styleSpecifics}"  />
                    </div>
                    <div class="fieldcontain">
                        <label for="howISpoke">How I Spoke</label>
                        <span class="required-indicator">*</span>
                        <input type="hidden" name="_howISpoke">
                        <g:select name="howISpoke" from="${com.speeddating.FeedbackM2W.HowISpoke.values()}" optionKey="key" multiple="true" value="${feedbackM2W?.howISpoke}" />
                    </div>
                    <div class="fieldcontain">
                        <label for="stoodOut">How I Spoke Specifics</label>
                        <g:textArea name="howISpokeSpecifics" value="${feedbackM2W?.howISpokeSpecifics}"  />
                    </div>
                    <div class="fieldcontain">
                        <label for="vibe">Vibe</label>
                        <span class="required-indicator">*</span>
                        <input type="hidden" name="_vibe">
                        <g:select name="vibe" from="${com.speeddating.FeedbackM2W.Vibe.values()}" optionKey="key" multiple="true" value="${feedbackM2W?.vibe}" />
                    </div>
                    <div class="fieldcontain">
                        <label for="vibeSpecifics">Vibe Specifics</label>
                        <g:textArea name="vibeSpecifics" value="${feedbackM2W?.vibeSpecifics}" />
                    </div>
                    <f:all bean="feedbackM2W" except="firstImpression, firstImpressionSpecifics, stoodOut, stoodOutSpecifics, style, styleSpecifics,
                    howISpoke, howISpokeSpecifics, vibe, vibeSpecifics, provider, recipient, event" />
                </fieldset>
                <fieldset class="buttons">
                    <input class="save" type="submit" value="${message(code: 'default.button.update.label', default: 'Update')}" />
                </fieldset>
            </g:form>
        </div>
    </body>
</html>
