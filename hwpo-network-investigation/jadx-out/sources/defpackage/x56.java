package defpackage;

import android.graphics.Rect;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import androidx.emoji2.text.d;
import com.intercom.twig.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x56 implements t18 {
    public final View a;
    public final nd5 b;
    public u56 e;
    public qga f;
    public lgb g;
    public Rect l;
    public final l56 m;
    public oh4<? super List<? extends ra3>, g2b> c = new v56(0);
    public oh4<? super r85, g2b> d = new ix3(1);
    public kha h = new kha(4, lja.b, BuildConfig.FLAVOR);
    public s85 i = s85.g;
    public final ArrayList j = new ArrayList();
    public final ss5 k = hv5.c(j26.u, new mh4() { // from class: w56
        @Override // defpackage.mh4
        public final Object invoke() {
            return new BaseInputConnection(this.t.a, false);
        }
    });

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public a() {
        }
    }

    public x56(View view, yo.a.b bVar, nd5 nd5Var) {
        this.a = view;
        this.b = nd5Var;
        this.m = new l56(bVar, nd5Var);
    }

    @Override // defpackage.t18
    public final pk8 a(EditorInfo editorInfo) {
        int i;
        int i2;
        kha khaVar = this.h;
        String str = khaVar.a.u;
        long j = khaVar.b;
        s85 s85Var = this.i;
        int i3 = s85Var.e;
        int i4 = s85Var.d;
        boolean z = s85Var.a;
        if (i3 == 1) {
            i = z ? 6 : 0;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                aa0.c("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        ad6 ad6Var = s85Var.f;
        if (xj5.a(ad6Var, ad6.v)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(ph1.n(ad6Var, 10));
            Iterator<yc6> it = ad6Var.t.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        if (i4 == 1) {
            i2 = 1;
        } else if (i4 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i2 = 1;
        } else if (i4 == 3) {
            i2 = 2;
        } else if (i4 == 4) {
            i2 = 3;
        } else if (i4 == 5) {
            i2 = 17;
        } else if (i4 == 6) {
            i2 = 33;
        } else if (i4 == 7) {
            i2 = 129;
        } else if (i4 == 8) {
            i2 = 18;
        } else {
            if (i4 != 9) {
                aa0.c("Invalid Keyboard Type");
                return null;
            }
            i2 = 8194;
        }
        editorInfo.inputType = i2;
        if (!z && (i2 & 1) == 1) {
            editorInfo.inputType = 131072 | i2;
            if (s85Var.e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i5 = editorInfo.inputType;
        if ((i5 & 1) == 1) {
            int i6 = s85Var.b;
            if (i6 == 1) {
                editorInfo.inputType = i5 | 4096;
            } else if (i6 == 2) {
                editorInfo.inputType = i5 | 8192;
            } else if (i6 == 3) {
                editorInfo.inputType = i5 | 16384;
            }
            if (s85Var.c) {
                editorInfo.inputType |= 32768;
            }
        }
        int i7 = lja.c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        vd3.c(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!p3a.a || i4 == 7 || i4 == 8) {
            vd3.d(editorInfo, false);
        } else {
            vd3.d(editorInfo, true);
            ud3.a(editorInfo);
        }
        o56.a aVar = o56.a;
        if (d.d()) {
            d.a().i(editorInfo);
        }
        pk8 pk8Var = new pk8(this.h, new a(), this.i.c, this.e, this.f, this.g);
        this.j.add(new WeakReference(pk8Var));
        return pk8Var;
    }
}
