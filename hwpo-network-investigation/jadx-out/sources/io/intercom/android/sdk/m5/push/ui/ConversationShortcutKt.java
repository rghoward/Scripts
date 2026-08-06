package io.intercom.android.sdk.m5.push.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.intercom.twig.Twig;
import defpackage.g2b;
import defpackage.js7;
import defpackage.ld6;
import defpackage.vn9;
import defpackage.ws0;
import defpackage.xj5;
import defpackage.xn9;
import defpackage.z90;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ConversationShortcutKt {
    public static final js7<List<vn9>, vn9> createTemporaryShortcut(Context context, String str, String str2, Bitmap bitmap) {
        Object next;
        Object obj;
        context.getClass();
        str.getClass();
        str2.getClass();
        List listD = xn9.d(context);
        ArrayList arrayListA = xn9.a(context);
        if (bitmap == null) {
            listD.getClass();
            Iterator it = listD.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                vn9 vn9Var = (vn9) next;
                if (xj5.a(vn9Var.b, str) && xj5.a(vn9Var.e, str2)) {
                    break;
                }
            }
            vn9 vn9Var2 = (vn9) next;
            if (vn9Var2 != null) {
                return new js7<>(null, vn9Var2);
            }
            int size = arrayListA.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    obj = null;
                    break;
                }
                obj = arrayListA.get(i);
                i++;
                vn9 vn9Var3 = (vn9) obj;
                if (xj5.a(vn9Var3.b, str) && xj5.a(vn9Var3.e, str2)) {
                    break;
                }
            }
            vn9 vn9Var4 = (vn9) obj;
            if (vn9Var4 != null) {
                return new js7<>(null, vn9Var4);
            }
        }
        vn9 vn9Var5 = new vn9();
        vn9Var5.a = context;
        vn9Var5.b = str;
        vn9Var5.l = true;
        vn9Var5.e = str2;
        vn9Var5.c = new Intent[]{new Intent("android.intent.action.VIEW")};
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(5);
            iconCompat.b = bitmap;
            vn9Var5.h = iconCompat;
        }
        if (TextUtils.isEmpty(vn9Var5.e)) {
            z90.a("Shortcut must have a non-empty label");
            return null;
        }
        Intent[] intentArr = vn9Var5.c;
        if (intentArr == null || intentArr.length == 0) {
            z90.a("Shortcut must have an intent");
            return null;
        }
        if (vn9Var5.k == null) {
            vn9Var5.k = new ld6(vn9Var5.b);
        }
        vn9Var5.l = true;
        xn9.e(context, vn9Var5);
        return new js7<>(arrayListA, vn9Var5);
    }

    public static final void resetShortcuts(Context context, List<? extends vn9> list, vn9 vn9Var, Twig twig) {
        context.getClass();
        twig.getClass();
        if (vn9Var != null) {
            xn9.f(context, ws0.h(vn9Var.b));
        }
        if (list != null) {
            try {
                xn9.h(context, list);
            } catch (IllegalArgumentException e) {
                twig.i(e, "Could not set dynamic shortcuts, max number of dynamic shortcuts exceeded.", new Object[0]);
                g2b g2bVar = g2b.a;
            }
        }
    }
}
