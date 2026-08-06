package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gxc {
    public static final ul8 a = k95.x("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, BuildConfig.FLAVOR);
        } catch (ClassCastException unused) {
            return BuildConfig.FLAVOR;
        }
    }

    public static final boolean b(vzb vzbVar, vl8 vl8Var, vl8 vl8Var2, xq9 xq9Var, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
        fxc fxcVar;
        char c;
        int iC = c(vzbVar);
        if (iC > 0 && (i2 != 1 || i != 1)) {
            cArr[iC] = '2';
        }
        if (g(vzbVar, vl8Var2) == wzb.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c = '3';
        } else {
            if (vzbVar == vzb.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i3 == 1 && xq9Var.w.equals(str)) {
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = '1';
                }
                return true;
            }
            if (vl8Var.containsKey(vzbVar) && (fxcVar = (fxc) vl8Var.get(vzbVar)) != null) {
                int iOrdinal = fxcVar.ordinal();
                wzb wzbVar = wzb.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (iOrdinal != 0) {
                    wzb wzbVar2 = wzb.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return g(vzbVar, vl8Var2) == wzbVar ? f(vzbVar, cArr, str3, z2) : e(vzbVar, cArr, str2, z);
                        }
                        if (iOrdinal == 3) {
                            return g(vzbVar, vl8Var2) == wzbVar2 ? e(vzbVar, cArr, str2, z) : f(vzbVar, cArr, str3, z2);
                        }
                        c = '0';
                    } else if (g(vzbVar, vl8Var2) != wzbVar2) {
                        return f(vzbVar, cArr, str3, z2);
                    }
                } else if (g(vzbVar, vl8Var2) != wzbVar) {
                    return e(vzbVar, cArr, str2, z);
                }
                c = '8';
            } else {
                c = '0';
            }
        }
        if (iC <= 0 || cArr[iC] == '2') {
            return false;
        }
        cArr[iC] = c;
        return false;
    }

    public static final int c(vzb vzbVar) {
        if (vzbVar == vzb.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (vzbVar == vzb.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (vzbVar == vzb.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return vzbVar == vzb.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final String d(vzb vzbVar, String str, String str2) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str) || str.length() < vzbVar.a()) ? "0" : String.valueOf(str.charAt(vzbVar.a() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= vzbVar.a()) {
            strValueOf = String.valueOf(str2.charAt(vzbVar.a() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    public static final boolean e(vzb vzbVar, char[] cArr, String str, boolean z) {
        char c;
        int iC = c(vzbVar);
        if (!z) {
            c = '4';
        } else {
            if (str.length() >= vzbVar.a()) {
                char cCharAt = str.charAt(vzbVar.a() - 1);
                boolean z2 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '6' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c;
        }
        return false;
    }

    public static final boolean f(vzb vzbVar, char[] cArr, String str, boolean z) {
        char c;
        int iC = c(vzbVar);
        if (!z) {
            c = '5';
        } else {
            if (str.length() >= vzbVar.a()) {
                char cCharAt = str.charAt(vzbVar.a() - 1);
                boolean z2 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '7' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c;
        }
        return false;
    }

    public static final wzb g(vzb vzbVar, vl8 vl8Var) {
        Object obj = vl8Var.get(vzbVar);
        if (obj == null) {
            obj = wzb.PURPOSE_RESTRICTION_UNDEFINED;
        }
        return (wzb) obj;
    }
}
