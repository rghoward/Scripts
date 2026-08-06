package defpackage;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.intercom.twig.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@gy2
public final class zha implements y18 {
    public final View a;
    public final md5 b;
    public final eia c;
    public boolean d;
    public oh4<? super List<? extends ra3>, g2b> e;
    public oh4<? super r85, g2b> f;
    public kha g;
    public s85 h;
    public final ArrayList i;
    public final ss5 j;
    public Rect k;
    public final ad2 l;
    public final k37<a> m;
    public yha n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final a t;
        public static final a u;
        public static final a v;
        public static final a w;
        public static final /* synthetic */ a[] x;

        static {
            a aVar = new a("StartInput", 0);
            t = aVar;
            a aVar2 = new a("StopInput", 1);
            u = aVar2;
            a aVar3 = new a("ShowKeyboard", 2);
            v = aVar3;
            a aVar4 = new a("HideKeyboard", 3);
            w = aVar4;
            x = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) x.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements oh4<List<? extends ra3>, g2b> {
        public static final b u = new b(1);

        @Override // defpackage.oh4
        public final /* bridge */ /* synthetic */ g2b invoke(List<? extends ra3> list) {
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends wp5 implements oh4<r85, g2b> {
        public static final c u = new c(1);

        @Override // defpackage.oh4
        public final /* synthetic */ g2b invoke(r85 r85Var) {
            int i = r85Var.a;
            return g2b.a;
        }
    }

    public zha(View view, cm cmVar) {
        md5 md5Var = new md5(view);
        eia eiaVar = new eia(Choreographer.getInstance());
        this.a = view;
        this.b = md5Var;
        this.c = eiaVar;
        this.e = cia.u;
        this.f = dia.u;
        this.g = new kha(4, lja.b, BuildConfig.FLAVOR);
        this.h = s85.g;
        this.i = new ArrayList();
        this.j = hv5.c(j26.u, new aia(this));
        this.l = new ad2(cmVar, md5Var);
        this.m = new k37<>(new a[16]);
    }

    @Override // defpackage.y18
    public final void a() {
        i(a.t);
    }

    @Override // defpackage.y18
    public final void b() {
        i(a.v);
    }

    @Override // defpackage.y18
    public final void c(kha khaVar, ag7 ag7Var, ria riaVar, zda zdaVar, sk8 sk8Var, sk8 sk8Var2) {
        ad2 ad2Var = this.l;
        synchronized (ad2Var.c) {
            try {
                ad2Var.j = khaVar;
                ad2Var.l = ag7Var;
                ad2Var.k = riaVar;
                ad2Var.m = zdaVar;
                ad2Var.n = sk8Var;
                ad2Var.o = sk8Var2;
                if (ad2Var.e || ad2Var.d) {
                    ad2Var.a();
                }
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.y18
    public final void d() {
        this.d = false;
        this.e = b.u;
        this.f = c.u;
        this.k = null;
        i(a.u);
    }

    @Override // defpackage.y18
    public final void e(kha khaVar, s85 s85Var, yda ydaVar, s56 s56Var) {
        this.d = true;
        this.g = khaVar;
        this.h = s85Var;
        this.e = ydaVar;
        this.f = s56Var;
        i(a.t);
    }

    @Override // defpackage.y18
    public final void f(kha khaVar, kha khaVar2) {
        boolean z = (lja.b(this.g.b, khaVar2.b) && xj5.a(this.g.c, khaVar2.c)) ? false : true;
        this.g = khaVar2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            ok8 ok8Var = (ok8) ((WeakReference) this.i.get(i)).get();
            if (ok8Var != null) {
                ok8Var.d = khaVar2;
            }
        }
        ad2 ad2Var = this.l;
        synchronized (ad2Var.c) {
            ad2Var.j = null;
            ad2Var.l = null;
            ad2Var.k = null;
            ad2Var.m = yc2.u;
            ad2Var.n = null;
            ad2Var.o = null;
            g2b g2bVar = g2b.a;
        }
        if (xj5.a(khaVar, khaVar2)) {
            if (z) {
                md5 md5Var = this.b;
                int iF = lja.f(khaVar2.b);
                int iE = lja.e(khaVar2.b);
                lja ljaVar = this.g.c;
                int iF2 = ljaVar != null ? lja.f(ljaVar.a) : -1;
                lja ljaVar2 = this.g.c;
                md5Var.a(iF, iE, iF2, ljaVar2 != null ? lja.e(ljaVar2.a) : -1);
                return;
            }
            return;
        }
        if (khaVar != null && (!xj5.a(khaVar.a.u, khaVar2.a.u) || (lja.b(khaVar.b, khaVar2.b) && !xj5.a(khaVar.c, khaVar2.c)))) {
            md5 md5Var2 = this.b;
            ((InputMethodManager) md5Var2.b.getValue()).restartInput(md5Var2.a);
            return;
        }
        int size2 = this.i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ok8 ok8Var2 = (ok8) ((WeakReference) this.i.get(i2)).get();
            if (ok8Var2 != null) {
                kha khaVar3 = this.g;
                md5 md5Var3 = this.b;
                if (ok8Var2.h) {
                    ok8Var2.d = khaVar3;
                    if (ok8Var2.f) {
                        ((InputMethodManager) md5Var3.b.getValue()).updateExtractedText(md5Var3.a, ok8Var2.e, p48.b(khaVar3));
                    }
                    lja ljaVar3 = khaVar3.c;
                    long j = khaVar3.b;
                    int iF3 = ljaVar3 != null ? lja.f(ljaVar3.a) : -1;
                    lja ljaVar4 = khaVar3.c;
                    md5Var3.a(lja.f(j), lja.e(j), iF3, ljaVar4 != null ? lja.e(ljaVar4.a) : -1);
                }
            }
        }
    }

    @Override // defpackage.y18
    public final void g() {
        i(a.w);
    }

    @Override // defpackage.y18
    @gy2
    public final void h(sk8 sk8Var) {
        Rect rect;
        this.k = new Rect(wk6.b(sk8Var.a), wk6.b(sk8Var.b), wk6.b(sk8Var.c), wk6.b(sk8Var.d));
        if (!this.i.isEmpty() || (rect = this.k) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Runnable, yha] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void i(a aVar) {
        this.m.d(aVar);
        if (this.n == null) {
            ?? r2 = new Runnable() { // from class: yha
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r8v2, types: [T, java.lang.Boolean] */
                /* JADX WARN: Type inference failed for: r8v3, types: [T, java.lang.Boolean] */
                /* JADX WARN: Type inference failed for: r8v6, types: [T, java.lang.Boolean] */
                @Override // java.lang.Runnable
                public final void run() {
                    View viewFindFocus;
                    zha zhaVar = this.t;
                    md5 md5Var = zhaVar.b;
                    zhaVar.n = null;
                    k37<zha.a> k37Var = zhaVar.m;
                    View view = zhaVar.a;
                    if (!view.isFocused() && (viewFindFocus = view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                        k37Var.k();
                        return;
                    }
                    gl8 gl8Var = new gl8();
                    gl8 gl8Var2 = new gl8();
                    zha.a[] aVarArr = k37Var.t;
                    int i = k37Var.v;
                    for (int i2 = 0; i2 < i; i2++) {
                        zha.a aVar2 = aVarArr[i2];
                        int iOrdinal = aVar2.ordinal();
                        if (iOrdinal == 0) {
                            ?? r8 = Boolean.TRUE;
                            gl8Var.t = r8;
                            gl8Var2.t = r8;
                        } else if (iOrdinal == 1) {
                            ?? r9 = Boolean.FALSE;
                            gl8Var.t = r9;
                            gl8Var2.t = r9;
                        } else if (iOrdinal != 2 && iOrdinal != 3) {
                            u.b();
                            return;
                        } else if (!xj5.a(gl8Var.t, Boolean.FALSE)) {
                            gl8Var2.t = Boolean.valueOf(aVar2 == zha.a.v);
                        }
                    }
                    k37Var.k();
                    if (xj5.a(gl8Var.t, Boolean.TRUE)) {
                        ((InputMethodManager) md5Var.b.getValue()).restartInput(md5Var.a);
                    }
                    Boolean bool = (Boolean) gl8Var2.t;
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            md5Var.c.a.b();
                        } else {
                            md5Var.c.a.a();
                        }
                    }
                    if (xj5.a(gl8Var.t, Boolean.FALSE)) {
                        ((InputMethodManager) md5Var.b.getValue()).restartInput(md5Var.a);
                    }
                }
            };
            this.c.execute(r2);
            this.n = r2;
        }
    }
}
