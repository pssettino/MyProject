/**
 * Created by AFREI on 02/09/2014.
 */
LanguageService = function () {

}

LanguageService.prototype.service = function (method, url, data) {
    return $.ajax({
        url: url,
        type: method,
        dataType: 'json',
        contentType: 'application/json'
    });
}

LanguageService.prototype.getLanguage = function () {
    var uri = "/myproject/language/";
    return this.service('GET', uri);
}

var languageService = new LanguageService();

