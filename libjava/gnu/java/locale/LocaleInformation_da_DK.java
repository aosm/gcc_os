// This file was automatically generated by localedef.

package gnu.java.locale;

import java.util.ListResourceBundle;

public class LocaleInformation_da_DK extends ListResourceBundle
{
  static final String decimalSeparator = ",";
  static final String groupingSeparator = ".";
  static final String numberFormat = "#,###,##0.###";
  static final String percentFormat = "#,###,##0%";
  static final String[] weekdays = { null, "s\u00F8ndag", "mandag", "tirsdag", "onsdag", "torsdag", "fredag", "l\u00F8rdag" };

  static final String[] shortWeekdays = { null, "s\u00F8n", "man", "tir", "ons", "tor", "fre", "l\u00F8r" };

  static final String[] shortMonths = { "jan", "feb", "mar", "apr", "maj", "jun", "jul", "aug", "sep", "okt", "nov", "dec", null };

  static final String[] months = { "januar", "februar", "marts", "april", "maj", "juni", "juli", "august", "september", "oktober", "november", "december", null };

  static final String[] ampms = { "", "" };

  static final String shortDateFormat = "dd-MM-yyyy";
  static final String defaultTimeFormat = "";
  static final String currencySymbol = "kr";
  static final String intlCurrencySymbol = "DKK";
  static final String currencyFormat = "$ #,###,##0.00;$ -#,###,##0.00";

  private static final Object[][] contents =
  {
    { "weekdays", weekdays },
    { "shortWeekdays", shortWeekdays },
    { "shortMonths", shortMonths },
    { "months", months },
    { "ampms", ampms },
    { "shortDateFormat", shortDateFormat },
    { "defaultTimeFormat", defaultTimeFormat },
    { "currencySymbol", currencySymbol },
    { "intlCurrencySymbol", intlCurrencySymbol },
    { "currencyFormat", currencyFormat },
    { "decimalSeparator", decimalSeparator },
    { "groupingSeparator", groupingSeparator },
    { "numberFormat", numberFormat },
    { "percentFormat", percentFormat },
  };

  public Object[][] getContents () { return contents; }
}