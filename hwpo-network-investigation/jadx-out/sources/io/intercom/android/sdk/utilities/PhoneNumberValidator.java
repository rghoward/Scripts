package io.intercom.android.sdk.utilities;

import android.content.Context;
import com.google.gson.Gson;
import com.intercom.twig.BuildConfig;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.CountryAreaCode;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class PhoneNumberValidator {
    private static final int MAX_LENGTH_WITHOUT_PREFIX = 15;
    private static final int MIN_LENGTH_WITHOUT_PREFIX = 6;
    private static final String NON_NUMBER_PATTERN = "\\D";
    private static final String PREFIX_PATTERN = "^(\\+)|(00)";
    private static final int PRIORITY_CONFLICTS_WITH_NO_SUB_CODES = 1;
    private static final int PRIORITY_CONFLICTS_WITH_SUB_CODES = 2;
    private static final int PRIORITY_NO_CONFLICTING_CODES = 0;
    private static final String SPECIAL_CHARACTERS = "^(\\()|(\\))|(-)";
    private static final String WHITESPACE_PATTERN = "\\s+";
    private static final List<CountryAreaCode> countryAreaCodes = new ArrayList();

    public static boolean containsPrefix(String str) {
        Matcher matcher = Pattern.compile(PREFIX_PATTERN).matcher(str);
        return matcher.find() && matcher.start() == 0;
    }

    public static CountryAreaCode getCountryAreaCodeFromLocale(String str) {
        for (CountryAreaCode countryAreaCode : countryAreaCodes) {
            if (str.equalsIgnoreCase(countryAreaCode.getCode())) {
                return countryAreaCode;
            }
        }
        return CountryAreaCode.UNKNOWN;
    }

    public static CountryAreaCode getCountryAreaCodeFromNumber(String str) {
        CountryAreaCode countryAreaCode = CountryAreaCode.UNKNOWN;
        for (CountryAreaCode countryAreaCode2 : countryAreaCodes) {
            if (str.startsWith(countryAreaCode2.getDialCode())) {
                int priority = countryAreaCode2.getPriority();
                if (priority != 0) {
                    if (priority == 1) {
                        countryAreaCode = countryAreaCode2;
                    } else if (priority == 2) {
                        String strSubstring = str.substring(countryAreaCode2.getDialCode().length());
                        Iterator<String> it = countryAreaCode2.getAreaCodes().iterator();
                        while (it.hasNext()) {
                            if (strSubstring.startsWith(it.next())) {
                            }
                        }
                    } else {
                        continue;
                    }
                }
                return countryAreaCode2;
            }
        }
        return countryAreaCode;
    }

    public static void loadCountryAreaCodes(Context context) {
        List<CountryAreaCode> list = countryAreaCodes;
        if (list.isEmpty()) {
            list.addAll(parseCodes(context));
        }
    }

    private static String loadJsonFromAsset(Context context) {
        try {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(R.raw.intercom_area_codes);
            byte[] bArr = new byte[inputStreamOpenRawResource.available()];
            inputStreamOpenRawResource.read(bArr);
            inputStreamOpenRawResource.close();
            return new String(bArr, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            return BuildConfig.FLAVOR;
        }
    }

    public static String normalizeNumber(String str) {
        return str.replaceAll(WHITESPACE_PATTERN, BuildConfig.FLAVOR).replaceAll(SPECIAL_CHARACTERS, BuildConfig.FLAVOR);
    }

    public static List<CountryAreaCode> parseCodes(Context context) {
        CountryAreaCode[] countryAreaCodeArr = (CountryAreaCode[]) new Gson().fromJson(loadJsonFromAsset(context), CountryAreaCode[].class);
        return countryAreaCodeArr != null ? Arrays.asList(countryAreaCodeArr) : new ArrayList();
    }

    public static String stripPrefix(String str) {
        return str.replaceFirst(PREFIX_PATTERN, BuildConfig.FLAVOR);
    }

    public static int validatePhoneNumber(String str) {
        String strNormalizeNumber = normalizeNumber(str);
        if (!containsPrefix(strNormalizeNumber)) {
            return 4;
        }
        String strStripPrefix = stripPrefix(strNormalizeNumber);
        if (Pattern.compile(NON_NUMBER_PATTERN).matcher(strStripPrefix).find()) {
            return 3;
        }
        String strReplaceAll = strStripPrefix.replaceAll(NON_NUMBER_PATTERN, BuildConfig.FLAVOR);
        if (strReplaceAll.length() > 15) {
            return 5;
        }
        CountryAreaCode countryAreaCodeFromNumber = getCountryAreaCodeFromNumber(strReplaceAll);
        int length = countryAreaCodeFromNumber.getDialCode().length();
        if (countryAreaCodeFromNumber.equals(CountryAreaCode.UNKNOWN)) {
            return 6;
        }
        return strReplaceAll.substring(length).length() < 6 ? 7 : 0;
    }
}
