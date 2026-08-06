package defpackage;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h21 {
    public static final WeakHashMap<String, NumberFormat> a = new WeakHashMap<>();

    public static String a(int i, Locale locale, int i2) {
        int i3 = (i2 & 1) != 0 ? 1 : 2;
        if ((i2 & 8) != 0) {
            locale = null;
        }
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String str = i3 + ".40.false." + locale.toLanguageTag();
        WeakHashMap<String, NumberFormat> weakHashMap = a;
        NumberFormat integerInstance = weakHashMap.get(str);
        if (integerInstance == null) {
            integerInstance = NumberFormat.getIntegerInstance(locale);
            integerInstance.setGroupingUsed(false);
            integerInstance.setMinimumIntegerDigits(i3);
            integerInstance.setMaximumIntegerDigits(40);
            weakHashMap.put(str, integerInstance);
        }
        return integerInstance.format(Integer.valueOf(i));
    }
}
