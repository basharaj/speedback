<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'feedbackW2M.label', default: 'FeedbackW2M')}" />
        <title><g:message code="default.create.label" args="[entityName]" /></title>
    </head>
    <body>
        <a href="#create-feedbackW2M" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div class="nav" role="navigation">
            <ul>
                <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
                <li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
            </ul>
        </div>
        <div id="create-feedbackW2M" class="content scaffold-create" role="main">
            <h1><g:message code="default.create.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${this.feedbackW2M}">
            <ul class="errors" role="alert">
                <g:eachError bean="${this.feedbackW2M}" var="error">
                <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
                </g:eachError>
            </ul>
            </g:hasErrors>
            <g:form action="save">
                <fieldset class="form">
                    <f:all bean="feedbackW2M" except="firstImpression, firstImpressionSpecifics, stoodOut, stoodOutSpecifics, style, styleSpecifics,
                    howISpoke, howISpokeSpecifics, vibe, vibeSpecifics, positiveFirstImpression, firstImpressionChange, whatIntriguedYouAboutMe,
                    raiseAnyFlags, raiseAnyFlagsSpecifics, wannaGoOutAgain, contact" />
                    <div class="fieldcontain">
                        <label for="firstImpression">First Impressions</label>
                        <span class="required-indicator">*</span>
                        <input type="hidden" name="_firstImpression">
                        <g:select name="firstImpression" from="${com.speeddating.FeedbackW2M.FirstImpression.values()}" optionKey="key" multiple="true" size="7" />
                    </div>
                    <div class="fieldcontain">
                        <label for="stoodOut">First Impressions Specifics</label>
                        <g:textArea name="firstImpressionSpecifics" value="${feedbackW2M?.firstImpressionSpecifics}"  />
                    </div>
                    <div class="fieldcontain">
                        <label for="stoodOut">Stood Out</label>
                        <span class="required-indicator">*</span>
                        <input type="hidden" name="_stoodOut">
                        <g:select name="stoodOut" from="${com.speeddating.FeedbackW2M.StoodOut.values()}" optionKey="key" multiple="true" size="7" />
                    </div>
                    <div class="fieldcontain">
                        <label for="stoodOut">Stood Out Specifics</label>
                        <g:textArea name="stoodOutSpecifics" value="${feedbackW2M?.stoodOutSpecifics}"  />
                    </div>
                    <div class="fieldcontain">
                        <label for="style">Style</label>
                        <span class="required-indicator">*</span>
                        <input type="hidden" name="_style">
                        <g:select name="style" from="${com.speeddating.FeedbackW2M.Style.values()}" optionKey="key" multiple="true" size="6" />
                    </div>
                    <div class="fieldcontain">
                        <label for="stoodOut">Style Specifics</label>
                        <g:textArea name="styleSpecifics" value="${feedbackW2M?.styleSpecifics}"  />
                    </div>
                    <div class="fieldcontain">
                        <label for="howISpoke">How I Spoke</label>
                        <span class="required-indicator">*</span>
                        <input type="hidden" name="_howISpoke">
                        <g:select name="howISpoke" from="${com.speeddating.FeedbackW2M.HowISpoke.values()}" optionKey="key" multiple="true" size="8" />
                    </div>
                    <div class="fieldcontain">
                        <label for="stoodOut">How I Spoke Specifics</label>
                        <g:textArea name="howISpokeSpecifics" value="${feedbackW2M?.howISpokeSpecifics}"  />
                    </div>
                    <div class="fieldcontain">
                        <label for="vibe">Vibe</label>
                        <span class="required-indicator">*</span>
                        <input type="hidden" name="_vibe">
                        <g:select name="vibe" from="${com.speeddating.FeedbackW2M.Vibe.values()}" optionKey="key" multiple="true" size="8" />
                    </div>
                    <div class="fieldcontain">
                        <label for="vibeSpecifics">Vibe Specifics</label>
                        <g:textArea name="vibeSpecifics" value="${feedbackW2M?.vibeSpecifics}"  />
                    </div>
                    <f:all bean="feedbackW2M" except="firstImpression, firstImpressionSpecifics, stoodOut, stoodOutSpecifics, style, styleSpecifics,
                    howISpoke, howISpokeSpecifics, vibe, vibeSpecifics, provider, recipient, event" />
                </fieldset>
                <fieldset class="buttons">
                    <g:submitButton name="create" class="save" value="${message(code: 'default.button.create.label', default: 'Create')}" />
                </fieldset>
            </g:form>
        </div>
    </body>
</html>
