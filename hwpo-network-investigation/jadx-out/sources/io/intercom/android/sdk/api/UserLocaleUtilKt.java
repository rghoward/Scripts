package io.intercom.android.sdk.api;

import android.content.Context;
import android.os.LocaleList;
import defpackage.th1;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class UserLocaleUtilKt {
    public static final String getUserLocaleString(Context context) {
        context.getClass();
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        locales.getClass();
        ArrayList arrayList = new ArrayList();
        int size = locales.size();
        for (int i = 0; i < size; i++) {
            Locale locale = locales.get(i);
            arrayList.add(locale.getLanguage() + '-' + locale.getCountry());
        }
        return th1.F(arrayList, ",", null, null, null, 62);
    }
}
