package com.luizmarcelo.emailapi.util;

public class TemplateBoasVindas {

    public static final String HTML = "<!doctype html>\n" +
            "<html lang=\"en\">\n" +
            "  <head>\n" +
            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
            "    <title>Simple Transactional Email</title>\n" +
            "    <style media=\"all\" type=\"text/css\">\n" +
            "    /* -------------------------------------\n" +
            "    GLOBAL RESETS\n" +
            "------------------------------------- */\n" +
            "    \n" +
            "    body {\n" +
            "      font-family: Helvetica, sans-serif;\n" +
            "      -webkit-font-smoothing: antialiased;\n" +
            "      font-size: 16px;\n" +
            "      line-height: 1.3;\n" +
            "      -ms-text-size-adjust: 100%;\n" +
            "      -webkit-text-size-adjust: 100%;\n" +
            "    }\n" +
            "    \n" +
            "    table {\n" +
            "      border-collapse: separate;\n" +
            "      mso-table-lspace: 0pt;\n" +
            "      mso-table-rspace: 0pt;\n" +
            "      width: 100%;\n" +
            "    }\n" +
            "    \n" +
            "    table td {\n" +
            "      font-family: Helvetica, sans-serif;\n" +
            "      font-size: 16px;\n" +
            "      vertical-align: top;\n" +
            "    }\n" +
            "    /* -------------------------------------\n" +
            "    BODY & CONTAINER\n" +
            "------------------------------------- */\n" +
            "    \n" +
            "    body {\n" +
            "      background-color: #f4f5f6;\n" +
            "      margin: 0;\n" +
            "      padding: 0;\n" +
            "    }\n" +
            "    \n" +
            "    .body {\n" +
            "      background-color: #f4f5f6;\n" +
            "      width: 100%;\n" +
            "    }\n" +
            "    \n" +
            "    .container {\n" +
            "      margin: 0 auto !important;\n" +
            "      max-width: 600px;\n" +
            "      padding: 0;\n" +
            "      padding-top: 24px;\n" +
            "      width: 600px;\n" +
            "    }\n" +
            "    \n" +
            "    .content {\n" +
            "      box-sizing: border-box;\n" +
            "      display: block;\n" +
            "      margin: 0 auto;\n" +
            "      max-width: 600px;\n" +
            "      padding: 0;\n" +
            "    }\n" +
            "    /* -------------------------------------\n" +
            "    HEADER, FOOTER, MAIN\n" +
            "------------------------------------- */\n" +
            "    \n" +
            "    .main {\n" +
            "      background: #ffffff;\n" +
            "      border: 1px solid #eaebed;\n" +
            "      border-radius: 16px;\n" +
            "      width: 100%;\n" +
            "    }\n" +
            "    \n" +
            "    .wrapper {\n" +
            "      box-sizing: border-box;\n" +
            "      padding: 24px;\n" +
            "    }\n" +
            "    \n" +
            "    .footer {\n" +
            "      clear: both;\n" +
            "      padding-top: 24px;\n" +
            "      text-align: center;\n" +
            "      width: 100%;\n" +
            "    }\n" +
            "    \n" +
            "    .footer td,\n" +
            "    .footer p,\n" +
            "    .footer span,\n" +
            "    .footer a {\n" +
            "      color: #9a9ea6;\n" +
            "      font-size: 16px;\n" +
            "      text-align: center;\n" +
            "    }\n" +
            "    /* -------------------------------------\n" +
            "    TYPOGRAPHY\n" +
            "------------------------------------- */\n" +
            "    \n" +
            "    p {\n" +
            "      font-family: Helvetica, sans-serif;\n" +
            "      font-size: 16px;\n" +
            "      font-weight: normal;\n" +
            "      margin: 0;\n" +
            "      margin-bottom: 16px;\n" +
            "    }\n" +
            "    \n" +
            "    a {\n" +
            "      color: #0867ec;\n" +
            "      text-decoration: underline;\n" +
            "    }\n" +
            "    /* -------------------------------------\n" +
            "    BUTTONS\n" +
            "------------------------------------- */\n" +
            "    \n" +
            "    .btn {\n" +
            "      box-sizing: border-box;\n" +
            "      min-width: 100% !important;\n" +
            "      width: 100%;\n" +
            "    }\n" +
            "    \n" +
            "    .btn > tbody > tr > td {\n" +
            "      padding-bottom: 16px;\n" +
            "    }\n" +
            "    \n" +
            "    .btn table {\n" +
            "      width: auto;\n" +
            "    }\n" +
            "    \n" +
            "    .btn table td {\n" +
            "      background-color: #ffffff;\n" +
            "      border-radius: 4px;\n" +
            "      text-align: center;\n" +
            "    }\n" +
            "    \n" +
            "    .btn a {\n" +
            "      background-color: #ffffff;\n" +
            "      border: solid 2px #0867ec;\n" +
            "      border-radius: 4px;\n" +
            "      box-sizing: border-box;\n" +
            "      color: #0867ec;\n" +
            "      cursor: pointer;\n" +
            "      display: inline-block;\n" +
            "      font-size: 16px;\n" +
            "      font-weight: bold;\n" +
            "      margin: 0;\n" +
            "      padding: 12px 24px;\n" +
            "      text-decoration: none;\n" +
            "      text-transform: capitalize;\n" +
            "    }\n" +
            "    \n" +
            "    .btn-primary table td {\n" +
            "      background-color: #0867ec;\n" +
            "    }\n" +
            "    \n" +
            "    .btn-primary a {\n" +
            "      background-color: #0867ec;\n" +
            "      border-color: #0867ec;\n" +
            "      color: #ffffff;\n" +
            "    }\n" +
            "    \n" +
            "    @media all {\n" +
            "      .btn-primary table td:hover {\n" +
            "        background-color: #ec0867 !important;\n" +
            "      }\n" +
            "      .btn-primary a:hover {\n" +
            "        background-color: #ec0867 !important;\n" +
            "        border-color: #ec0867 !important;\n" +
            "      }\n" +
            "    }\n" +
            "    \n" +
            "    /* -------------------------------------\n" +
            "    OTHER STYLES THAT MIGHT BE USEFUL\n" +
            "------------------------------------- */\n" +
            "    \n" +
            "    .last {\n" +
            "      margin-bottom: 0;\n" +
            "    }\n" +
            "    \n" +
            "    .first {\n" +
            "      margin-top: 0;\n" +
            "    }\n" +
            "    \n" +
            "    .align-center {\n" +
            "      text-align: center;\n" +
            "    }\n" +
            "    \n" +
            "    .align-right {\n" +
            "      text-align: right;\n" +
            "    }\n" +
            "    \n" +
            "    .align-left {\n" +
            "      text-align: left;\n" +
            "    }\n" +
            "    \n" +
            "    .text-link {\n" +
            "      color: #0867ec !important;\n" +
            "      text-decoration: underline !important;\n" +
            "    }\n" +
            "    \n" +
            "    .clear {\n" +
            "      clear: both;\n" +
            "    }\n" +
            "    \n" +
            "    .mt0 {\n" +
            "      margin-top: 0;\n" +
            "    }\n" +
            "    \n" +
            "    .mb0 {\n" +
            "      margin-bottom: 0;\n" +
            "    }\n" +
            "    \n" +
            "    .preheader {\n" +
            "      color: transparent;\n" +
            "      display: none;\n" +
            "      height: 0;\n" +
            "      max-height: 0;\n" +
            "      max-width: 0;\n" +
            "      opacity: 0;\n" +
            "      overflow: hidden;\n" +
            "      mso-hide: all;\n" +
            "      visibility: hidden;\n" +
            "      width: 0;\n" +
            "    }\n" +
            "    \n" +
            "    .powered-by a {\n" +
            "      text-decoration: none;\n" +
            "    }\n" +
            "    \n" +
            "    /* -------------------------------------\n" +
            "    RESPONSIVE AND MOBILE FRIENDLY STYLES\n" +
            "------------------------------------- */\n" +
            "    \n" +
            "    @media only screen and (max-width: 640px) {\n" +
            "      .main p,\n" +
            "      .main td,\n" +
            "      .main span {\n" +
            "        font-size: 16px !important;\n" +
            "      }\n" +
            "      .wrapper {\n" +
            "        padding: 8px !important;\n" +
            "      }\n" +
            "      .content {\n" +
            "        padding: 0 !important;\n" +
            "      }\n" +
            "      .container {\n" +
            "        padding: 0 !important;\n" +
            "        padding-top: 8px !important;\n" +
            "        width: 100% !important;\n" +
            "      }\n" +
            "      .main {\n" +
            "        border-left-width: 0 !important;\n" +
            "        border-radius: 0 !important;\n" +
            "        border-right-width: 0 !important;\n" +
            "      }\n" +
            "      .btn table {\n" +
            "        max-width: 100% !important;\n" +
            "        width: 100% !important;\n" +
            "      }\n" +
            "      .btn a {\n" +
            "        font-size: 16px !important;\n" +
            "        max-width: 100% !important;\n" +
            "        width: 100% !important;\n" +
            "      }\n" +
            "    }\n" +
            "    /* -------------------------------------\n" +
            "    PRESERVE THESE STYLES IN THE HEAD\n" +
            "------------------------------------- */\n" +
            "    \n" +
            "    @media all {\n" +
            "      .ExternalClass {\n" +
            "        width: 100%;\n" +
            "      }\n" +
            "      .ExternalClass,\n" +
            "      .ExternalClass p,ff\n" +
            "      .ExternalClass span,\n" +
            "      .ExternalClass font,\n" +
            "      .ExternalClass td,\n" +
            "      .ExternalClass div {\n" +
            "        line-height: 100%;\n" +
            "      }\n" +
            "      .apple-link a {\n" +
            "        color: inherit !important;\n" +
            "        font-family: inherit !important;\n" +
            "        font-size: inherit !important;\n" +
            "        font-weight: inherit !important;\n" +
            "        line-height: inherit !important;\n" +
            "        text-decoration: none !important;\n" +
            "      }\n" +
            "      #MessageViewBody a {\n" +
            "        color: inherit;\n" +
            "        text-decoration: none;\n" +
            "        font-size: inherit;\n" +
            "        font-family: inherit;\n" +
            "        font-weight: inherit;\n" +
            "        line-height: inherit;\n" +
            "      }\n" +
            "    }\n" +
            "    </style>\n" +
            "  </head>\n" +
            "  <body>\n" +
            "    <table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"body\">\n" +
            "      <tr>\n" +
            "        <td>&nbsp;</td>\n" +
            "        <td class=\"container\">\n" +
            "          <div class=\"content\">\n" +
            "\n" +
            "            <!-- START CENTERED WHITE CONTAINER -->\n" +
            "            <span class=\"preheader\">This is preheader text. Some clients will show this text as a preview.</span>\n" +
            "            <table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"main\">\n" +
            "\n" +
            "              <!-- START MAIN CONTENT AREA -->\n" +
            "              <tr>\n" +
            "                <td class=\"wrapper\">\n" +
            "                  <p>Olá!</p>\n" +
            "                  <p>É com grande prazer que damos as boas-vindas à nossa comunidade! Em nome de toda a equipe, queremos expressar nossa sincera gratidão por se juntar a nós.</p>\t\t\t\t\n" +
            "                  \n" +
            "                  \n" +
            "                  \n" +
            "                  \n" +
            "                  <table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"btn btn-primary\">\n" +
            "                    <tbody>\n" +
            "                      <tr>\n" +
            "                        <td align=\"left\">\n" +
            "                          <table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
            "                            <tbody>\n" +
            "                              <tr>\n" +
            "                                <td> <a href=\"http://htmlemail.io\" target=\"_blank\">Começar</a> </td>\n" +
            "                              </tr>\n" +
            "                            </tbody>\n" +
            "                          </table>\n" +
            "                        </td>\n" +
            "                      </tr>\n" +
            "                    </tbody>\n" +
            "                  </table>\n" +
            "                  <p>Mais uma vez, seja muito bem-vindo(a)! Estamos ansiosos para construir um futuro incrível juntos.</p>\n" +
            "                  <p>Atenciosamente.</p>\n" +
            "                </td>\n" +
            "              </tr>\n" +
            "\n" +
            "              <!-- END MAIN CONTENT AREA -->\n" +
            "              </table>\n" +
            "\n" +
            "            <!-- START FOOTER -->\n" +
            "            <div class=\"footer\">\n" +
            "              <table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
            "                <tr>\n" +
            "                  <td class=\"content-block\">\n" +
            "                    <span class=\"apple-link\">Luiz Company</span>\n" +
            "                    <br> Não quer receber emails? <a href=\"http://htmlemail.io/blog\">Desinscrever</a>.\n" +
            "                  </td>\n" +
            "                </tr>\n" +
            "                <tr>\n" +
            "                  <td class=\"content-block powered-by\">\n" +
            "                    Powered by <a href=\"http://htmlemail.io\">HTMLemail.io</a>\n" +
            "                  </td>\n" +
            "                </tr>\n" +
            "              </table>\n" +
            "            </div>\n" +
            "\n" +
            "            <!-- END FOOTER -->\n" +
            "            \n" +
            "<!-- END CENTERED WHITE CONTAINER --></div>\n" +
            "        </td>\n" +
            "        <td>&nbsp;</td>\n" +
            "      </tr>\n" +
            "    </table>\n" +
            "  </body>\n" +
            "</html>";
}
