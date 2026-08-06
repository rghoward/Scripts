package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o18 implements j18 {
    public final h72 a;
    public final Context b;
    public final aa9 c;
    public final ad6 d;
    public TextClassifier f;
    public final a47 e = new a47();
    public final dt7 g = bl7.i(null);
    public final Object h = new Object();

    public o18(h72 h72Var, Context context, aa9 aa9Var, ad6 ad6Var) {
        this.a = h72Var;
        this.b = context;
        this.c = aa9Var;
        this.d = ad6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object d(o18 o18Var, CharSequence charSequence, long j, TextClassifier textClassifier, u02 u02Var) throws Throwable {
        k18 k18Var;
        long j2;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        a47 a47Var;
        TextClassification textClassificationClassifyText;
        long j3;
        CharSequence charSequence3;
        dt7 dt7Var = o18Var.g;
        a47 a47Var2 = o18Var.e;
        if (u02Var instanceof k18) {
            k18Var = (k18) u02Var;
            int i = k18Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                k18Var.z = i - Integer.MIN_VALUE;
            } else {
                k18Var = new k18(o18Var, u02Var);
            }
        } else {
            k18Var = new k18(o18Var, u02Var);
        }
        Object obj = k18Var.x;
        int i2 = k18Var.z;
        v72 v72Var = v72.t;
        try {
            if (i2 == 0) {
                dv8.b(obj);
                k18Var.t = charSequence;
                k18Var.u = textClassifier;
                k18Var.v = a47Var2;
                j2 = j;
                k18Var.w = j2;
                k18Var.z = 1;
                if (a47Var2.b(k18Var) != v72Var) {
                    charSequence2 = charSequence;
                    textClassifier2 = textClassifier;
                    a47Var = a47Var2;
                }
                return v72Var;
            }
            if (i2 == 1) {
                j2 = k18Var.w;
                a47Var = k18Var.v;
                textClassifier2 = (TextClassifier) k18Var.u;
                charSequence2 = k18Var.t;
                dv8.b(obj);
            } else {
                if (i2 != 2) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j3 = k18Var.w;
                a47Var2 = k18Var.v;
                textClassificationClassifyText = (TextClassification) k18Var.u;
                charSequence3 = k18Var.t;
                dv8.b(obj);
            }
            try {
                dt7Var.setValue(new aca(charSequence3, j3, textClassificationClassifyText));
                g2b g2bVar = g2b.a;
                return g2b.a;
            } finally {
                a47Var2.c(null);
            }
            aca acaVar = (aca) dt7Var.getValue();
            if (acaVar != null) {
                y0a y0aVar = q18.a;
                if (lja.b(j2, acaVar.b) && xj5.a(charSequence2, acaVar.a)) {
                    g2b g2bVar2 = g2b.a;
                    a47Var.c(null);
                    return g2bVar2;
                }
            }
            g2b g2bVar3 = g2b.a;
            a47Var.c(null);
            textClassificationClassifyText = textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, lja.f(j2), lja.e(j2)).setDefaultLocales(o18Var.f()).build());
            k18Var.t = charSequence2;
            k18Var.u = textClassificationClassifyText;
            k18Var.v = a47Var2;
            k18Var.w = j2;
            k18Var.z = 2;
            if (a47Var2.b(k18Var) != v72Var) {
                j3 = j2;
                charSequence3 = charSequence2;
                dt7Var.setValue(new aca(charSequence3, j3, textClassificationClassifyText));
                g2b g2bVar4 = g2b.a;
                return g2b.a;
            }
            return v72Var;
        } catch (Throwable th) {
            a47Var.c(null);
            throw th;
        }
    }

    @Override // defpackage.j18
    public final Object a(String str, long j, jga jgaVar) throws Throwable {
        Object objG;
        if (str.length() == 0 || lja.c(j)) {
            objG = g2b.a;
        } else {
            objG = oy0.g(this.a, new m18(this, new l18(j, null, this, str), null), jgaVar);
        }
        return objG == v72.t ? objG : g2b.a;
    }

    @Override // defpackage.j18
    public final Object b(String str, long j, iga igaVar) throws Throwable {
        Object objG;
        if (str.length() == 0 || lja.c(j)) {
            objG = g2b.a;
        } else {
            objG = oy0.g(this.a, new m18(this, new l18(j, null, this, str), null), igaVar);
        }
        return objG == v72.t ? objG : g2b.a;
    }

    @Override // defpackage.j18
    public final Object c(CharSequence charSequence, long j, pga pgaVar) {
        if (charSequence.length() == 0 || lja.c(j)) {
            return null;
        }
        return oy0.g(this.a, new m18(this, new n18(j, null, this, charSequence), null), pgaVar);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void e(cca ccaVar, String str, long j, xga xgaVar) {
        TextClassification textClassification;
        a47 a47Var = this.e;
        TextClassification textClassification2 = null;
        if (a47Var.h()) {
            aca acaVar = (aca) this.g.getValue();
            if (acaVar != null) {
                y0a y0aVar = q18.a;
                if (lja.b(j, acaVar.b) && xj5.a(str, acaVar.a)) {
                    textClassification = acaVar.c;
                } else {
                    textClassification = null;
                }
            } else {
                textClassification = null;
            }
            a47Var.c(null);
            textClassification2 = textClassification;
        }
        if (textClassification2 == null) {
            xgaVar.invoke(ccaVar);
            return;
        }
        boolean zIsEmpty = textClassification2.getActions().isEmpty();
        Object obj = this.h;
        if (!zIsEmpty) {
            ccaVar.a.g(new bda(obj, textClassification2, 0));
        } else if ((textClassification2.getIcon() != null || !TextUtils.isEmpty(textClassification2.getLabel())) && (textClassification2.getIntent() != null || textClassification2.getOnClickListener() != null)) {
            ccaVar.a.g(new bda(obj, textClassification2, -1));
        }
        xgaVar.invoke(ccaVar);
        List<RemoteAction> actions = textClassification2.getActions();
        int size = actions.size();
        for (int i = 0; i < size; i++) {
            actions.get(i);
            if (i > 0) {
                ccaVar.a.g(new bda(obj, textClassification2, i));
            }
        }
    }

    public final LocaleList f() {
        ad6 ad6Var = this.d;
        if (ad6Var == null) {
            return new LocaleList(w08.a.a().t.get(0).a);
        }
        ArrayList arrayList = new ArrayList(ph1.n(ad6Var, 10));
        Iterator<yc6> it = ad6Var.t.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
