package io.intercom.android.sdk.ui.common;

import android.content.Context;
import defpackage.hf3;
import defpackage.js7;
import defpackage.w2a;
import defpackage.wu0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ActualStringOrResKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final String parseString(Context context, int i, List<js7<String, String>> list) {
        context.getClass();
        list.getClass();
        String string = context.getString(i);
        string.getClass();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            js7 js7Var = (js7) it.next();
            string = w2a.l(string, wu0.a(new StringBuilder("{"), (String) js7Var.t, '}'), (String) js7Var.u);
        }
        return string;
    }

    public static /* synthetic */ String parseString$default(Context context, int i, List list, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            list = hf3.t;
        }
        return parseString(context, i, list);
    }
}
