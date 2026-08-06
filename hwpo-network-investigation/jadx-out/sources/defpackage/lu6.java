package defpackage;

import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lu6 {
    public static final SpannedString a(String str, List<hr6> list, String str2, int i, int i2, int i3) {
        int length;
        int i4;
        int i5;
        char cCharAt;
        String str3 = str.length() > 0 ? str : null;
        if (str3 == null) {
            return null;
        }
        Spanned spannedFromHtml = Html.fromHtml(str3, 63);
        spannedFromHtml.getClass();
        kh6 kh6Var = new kh6(list.size());
        for (hr6 hr6Var : list) {
            kh6Var.put(Long.valueOf(hr6Var.a), hr6Var);
        }
        kh6 kh6VarF = pi6.f(kh6Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i6 = 0;
        while (i6 < spannedFromHtml.length()) {
            char cCharAt2 = spannedFromHtml.charAt(i6);
            if (cCharAt2 != '@') {
                spannableStringBuilder.append(cCharAt2);
                i6++;
            } else {
                int i7 = i6 + 1;
                String string = spannedFromHtml.toString();
                int i8 = i7;
                while (i8 < string.length() && '0' <= (cCharAt = string.charAt(i8)) && cCharAt < ':') {
                    i8++;
                }
                String string2 = spannedFromHtml.subSequence(i7, i8).toString();
                boolean zW = z2a.w(string2);
                if (zW) {
                    int i9 = i8;
                    while (i9 < spannedFromHtml.length() && (spannedFromHtml.charAt(i9) == 'a' || spannedFromHtml.charAt(i9) == 'l')) {
                        i9++;
                    }
                    boolean z = (!xj5.a(spannedFromHtml.subSequence(i7, i9).toString(), "all") || str2 == null || z2a.w(str2)) ? false : true;
                    i4 = i9 - i8;
                    if (z) {
                        StyleSpan styleSpan = new StyleSpan(1);
                        int length2 = spannableStringBuilder.length();
                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i3);
                        int length3 = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) str2);
                        spannableStringBuilder.setSpan(foregroundColorSpan, length3, spannableStringBuilder.length(), 17);
                        spannableStringBuilder.setSpan(styleSpan, length2, spannableStringBuilder.length(), 17);
                    } else {
                        if (z) {
                            u.b();
                            return null;
                        }
                        spannableStringBuilder.append((CharSequence) spannedFromHtml.subSequence(i8 - 1, i8 + i4).toString());
                    }
                } else {
                    if (zW) {
                        u.b();
                        return null;
                    }
                    long j = Long.parseLong(string2);
                    boolean zContainsKey = ((mh6) kh6VarF.keySet()).t.containsKey(Long.valueOf(j));
                    if (zContainsKey) {
                        Object obj = kh6VarF.get(Long.valueOf(j));
                        if (obj == null) {
                            z90.a("Required value was null.");
                            return null;
                        }
                        hr6 hr6Var2 = (hr6) obj;
                        boolean z2 = hr6Var2.b;
                        if (z2) {
                            i5 = i2;
                        } else {
                            if (z2) {
                                u.b();
                                return null;
                            }
                            i5 = i;
                        }
                        StyleSpan styleSpan2 = new StyleSpan(1);
                        int length4 = spannableStringBuilder.length();
                        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(i5);
                        int length5 = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) hr6Var2.c);
                        spannableStringBuilder.setSpan(foregroundColorSpan2, length5, spannableStringBuilder.length(), 17);
                        spannableStringBuilder.setSpan(styleSpan2, length4, spannableStringBuilder.length(), 17);
                        length = string2.length();
                    } else {
                        if (zContainsKey) {
                            u.b();
                            return null;
                        }
                        String str4 = "@" + j;
                        spannableStringBuilder.append((CharSequence) str4);
                        length = str4.length();
                    }
                    i4 = length;
                }
                i6 += i4 + 1;
            }
        }
        return new SpannedString(spannableStringBuilder);
    }
}
