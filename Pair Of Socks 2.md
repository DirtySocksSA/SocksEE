if (DateFrom != null && DateTo != null) {
    String DateFromString = df.format(DateFrom);
    String DateToString = df.format(DateTo);
    int apodate = Integer.parseInt(DateFromString.substring(0, 2));
    int apomonth = Integer.parseInt(DateFromString.substring(3, 5));
    int apoyear = Integer.parseInt(DateFromString.substring(6, 10));
    int ewsdate = Integer.parseInt(DateToString.substring(0, 2));
    int ewsmonth = Integer.parseInt(DateToString.substring(3, 5));
    int ewsyear = Integer.parseInt(DateToString.substring(6, 10));
    int monthDiff = ewsmonth - apomonth;
    if (monthDiff < 0) {
        monthDiff = monthDiff + 12;
    }
    int apoDateInversed = apoyear + apodate;
    int ewsDateInversed = ewsyear + monthDiff * 31 + ewsdate;
    int dateRange = getReportDateRange();
    if (ewsDateInversed - apoDateInversed >= dateRange) {
        throw new Exception("days difference to large");
    }
}
