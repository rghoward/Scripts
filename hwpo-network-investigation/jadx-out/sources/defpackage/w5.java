package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.PickedOptionTextView;
import com.intercom.twig.BuildConfig;
import j$.time.LocalDate;
import java.io.File;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w5 extends vw4 {
    public final vg4 A = new vg4(new c0());
    public final shb B;
    public final o7a C;
    public final w9<String> D;
    public final w9<Uri> E;
    public static final /* synthetic */ ho5<Object>[] F = {new ne8(w5.class, "binding", "getBinding()Lcom/hwpo_training_app/profile/databinding/FragmentAccountBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a0 extends pi4 implements mh4<g2b> {
        @Override // defpackage.mh4
        public final g2b invoke() {
            e8 e8Var = (e8) this.receiver;
            File file = e8Var.H;
            if (file != null) {
                file.delete();
            }
            e8Var.I = null;
            oy0.d(rhb.b(e8Var), null, null, new l8(e8Var, null), 3);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.account.presentation.AccountFragment$initListeners$1$10", f = "AccountFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public b(r02<? super b> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return w5.this.new b(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = w5.Companion;
            e8 e8VarQ = w5.this.q();
            bu8 bu8Var = e8VarQ.F;
            e8VarQ.f(new i5.a(new l55.b(bu8Var.b(R.string.delete_account, new Object[0]), bu8Var.b(R.string.delete_account_description, new Object[0]), bu8Var.b(R.string.cancel, new Object[0]), bu8Var.b(R.string.delete, new Object[0]), Integer.valueOf(bu8Var.a(R.color.alertErrorText)))));
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b0 extends pi4 implements mh4<g2b> {
        @Override // defpackage.mh4
        public final g2b invoke() {
            e8 e8Var = (e8) this.receiver;
            e8Var.getClass();
            e8Var.f(i5.c.b);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.account.presentation.AccountFragment$initListeners$1$1", f = "AccountFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public c(r02<? super c> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return w5.this.new c(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = w5.Companion;
            e8 e8VarQ = w5.this.q();
            bu8 bu8Var = e8VarQ.F;
            e8VarQ.f(new i5.b(new l55.b(bu8Var.b(R.string.delete_photo, new Object[0]), bu8Var.b(R.string.photo_confirm_delete, new Object[0]), bu8Var.b(R.string.cancel, new Object[0]), bu8Var.b(R.string.delete, new Object[0]), Integer.valueOf(bu8Var.a(R.color.alertErrorText)))));
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c0 implements oh4<w5, zd4> {
        @Override // defpackage.oh4
        public final zd4 invoke(w5 w5Var) {
            w5 w5Var2 = w5Var;
            w5Var2.getClass();
            return zd4.bind(w5Var2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.account.presentation.AccountFragment$initListeners$1$2", f = "AccountFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public d(r02<? super d> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return w5.this.new d(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = w5.Companion;
            w5.this.q().f(i5.l.b);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d0 extends wp5 implements mh4<androidx.fragment.app.f> {
        public d0() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return w5.this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.account.presentation.AccountFragment$initListeners$1$3", f = "AccountFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public e(r02<? super e> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return w5.this.new e(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = w5.Companion;
            e8 e8VarQ = w5.this.q();
            e8VarQ.f(new i5.h(e8VarQ.b().b));
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e0 extends wp5 implements mh4<whb> {
        public final /* synthetic */ d0 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(d0 d0Var) {
            super(0);
            this.u = d0Var;
        }

        @Override // defpackage.mh4
        public final whb invoke() {
            return (whb) this.u.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.account.presentation.AccountFragment$initListeners$1$4", f = "AccountFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public f(r02<? super f> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return w5.this.new f(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = w5.Companion;
            e8 e8VarQ = w5.this.q();
            e8VarQ.f(new i5.j(e8VarQ.b().c));
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f0 extends wp5 implements mh4<vhb> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(ss5 ss5Var) {
            super(0);
            this.u = ss5Var;
        }

        @Override // defpackage.mh4
        public final vhb invoke() {
            return ((whb) this.u.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.account.presentation.AccountFragment$initListeners$1$5", f = "AccountFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public g(r02<? super g> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return w5.this.new g(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = w5.Companion;
            e8 e8VarQ = w5.this.q();
            LocalDate localDateNow = e8VarQ.b().g;
            if (localDateNow == null) {
                localDateNow = LocalDate.now();
            }
            LocalDate localDateMinusYears = LocalDate.now().minusYears(16L);
            localDateNow.getClass();
            localDateMinusYears.getClass();
            e8VarQ.f(new i5.e(localDateNow, localDateMinusYears));
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g0 extends wp5 implements mh4<lb2> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(ss5 ss5Var) {
            super(0);
            this.u = ss5Var;
        }

        @Override // defpackage.mh4
        public final lb2 invoke() {
            whb whbVar = (whb) this.u.getValue();
            wt4 wt4Var = whbVar instanceof wt4 ? (wt4) whbVar : null;
            return wt4Var != null ? wt4Var.getDefaultViewModelCreationExtras() : lb2.a.b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.account.presentation.AccountFragment$initListeners$1$6", f = "AccountFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class h extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public h(r02<? super h> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return w5.this.new h(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = w5.Companion;
            e8 e8VarQ = w5.this.q();
            l5b l5bVar = e8VarQ.b().h;
            e8VarQ.f(new i5.m(l5bVar != null ? l5bVar.a : null));
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h0 extends wp5 implements mh4<thb.c> {
        public final /* synthetic */ ss5 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(ss5 ss5Var) {
            super(0);
            this.v = ss5Var;
        }

        @Override // defpackage.mh4
        public final thb.c invoke() {
            thb.c defaultViewModelProviderFactory;
            whb whbVar = (whb) this.v.getValue();
            wt4 wt4Var = whbVar instanceof wt4 ? (wt4) whbVar : null;
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? w5.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.account.presentation.AccountFragment$initListeners$1$7", f = "AccountFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class i extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public i(r02<? super i> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return w5.this.new i(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = w5.Companion;
            e8 e8VarQ = w5.this.q();
            e8VarQ.x.c(e8VarQ.b().i);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.account.presentation.AccountFragment$initListeners$1$8", f = "AccountFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class j extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public j(r02<? super j> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return w5.this.new j(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = w5.Companion;
            w5.this.q().f(i5.f.b);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.account.presentation.AccountFragment$initListeners$1$9", f = "AccountFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class k extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
        public k(r02<? super k> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
            return w5.this.new k(r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            a aVar = w5.Companion;
            w5.this.q().f(i5.d.b);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class l implements oh4<String, g2b> {
        public final /* synthetic */ MaterialTextView t;

        public l(MaterialTextView materialTextView) {
            this.t = materialTextView;
        }

        @Override // defpackage.oh4
        public final g2b invoke(String str) {
            this.t.setText(str);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class m implements oh4<Boolean, g2b> {
        public m() {
        }

        @Override // defpackage.oh4
        public final g2b invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = w5.Companion;
            w5.this.p().n.setVisible(zBooleanValue);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class n implements oh4<String, g2b> {
        public n() {
        }

        @Override // defpackage.oh4
        public final g2b invoke(String str) {
            String str2 = str;
            a aVar = w5.Companion;
            final zd4 zd4VarP = w5.this.p();
            if (str2 == null) {
                xgb.c(zd4VarP.p, true);
            }
            xgb.f(zd4VarP.b, str2, new mh4() { // from class: t5
                @Override // defpackage.mh4
                public final Object invoke() {
                    w5.a aVar2 = w5.Companion;
                    xgb.c(zd4VarP.p, false);
                    return g2b.a;
                }
            });
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class o implements oh4<Boolean, g2b> {
        public final /* synthetic */ x t;

        public o(x xVar) {
            this.t = xVar;
        }

        @Override // defpackage.oh4
        public final g2b invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.getClass();
            ((View) this.t.receiver).setVisibility(bool2.booleanValue() ? 0 : 8);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class p implements oh4<String, g2b> {
        public final /* synthetic */ y t;

        public p(y yVar) {
            this.t = yVar;
        }

        @Override // defpackage.oh4
        public final g2b invoke(String str) {
            ((PickedOptionTextView) this.t.receiver).setPickedOptionText(str);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class q implements oh4<String, g2b> {
        public final /* synthetic */ z t;

        public q(z zVar) {
            this.t = zVar;
        }

        @Override // defpackage.oh4
        public final g2b invoke(String str) {
            ((PickedOptionTextView) this.t.receiver).setPickedOptionText(str);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class r implements oh4<String, g2b> {
        public r() {
        }

        @Override // defpackage.oh4
        public final g2b invoke(String str) {
            a aVar = w5.Companion;
            xx.f(w5.this.p().p, str);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class s implements oh4<String, g2b> {
        public final /* synthetic */ v t;

        public s(v vVar) {
            this.t = vVar;
        }

        @Override // defpackage.oh4
        public final g2b invoke(String str) {
            ((PickedOptionTextView) this.t.receiver).setPickedOptionText(str);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class t implements oh4<String, g2b> {
        public final /* synthetic */ w t;

        public t(w wVar) {
            this.t = wVar;
        }

        @Override // defpackage.oh4
        public final g2b invoke(String str) {
            ((PickedOptionTextView) this.t.receiver).setPickedOptionText(str);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class u implements oh4<l5b, g2b> {
        public u() {
        }

        @Override // defpackage.oh4
        public final g2b invoke(l5b l5bVar) {
            l5b l5bVar2 = l5bVar;
            a aVar = w5.Companion;
            w5.this.p().i.setPickedOptionText(l5bVar2 != null ? l5bVar2.b : null);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class v extends y27 {
        @Override // defpackage.eo5
        public final Object get() {
            return ((PickedOptionTextView) this.receiver).getPickedOptionText();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class w extends y27 {
        @Override // defpackage.eo5
        public final Object get() {
            return ((PickedOptionTextView) this.receiver).getPickedOptionText();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class x extends y27 {
        @Override // defpackage.eo5
        public final Object get() {
            return Boolean.valueOf(((View) this.receiver).getVisibility() == 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class y extends y27 {
        @Override // defpackage.eo5
        public final Object get() {
            return ((PickedOptionTextView) this.receiver).getPickedOptionText();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class z extends y27 {
        @Override // defpackage.eo5
        public final Object get() {
            return ((PickedOptionTextView) this.receiver).getPickedOptionText();
        }
    }

    public w5() {
        ss5 ss5VarC = hv5.c(j26.u, new e0(new d0()));
        this.B = new shb(ll8.a(e8.class), new f0(ss5VarC), new h0(ss5VarC), new g0(ss5VarC));
        this.C = new o7a(new mh4() { // from class: u5
            @Override // defpackage.mh4
            public final Object invoke() {
                w5.a aVar = w5.Companion;
                yx7.Companion.getClass();
                yx7 yx7Var = new yx7();
                w5 w5Var = this.t;
                yx7Var.K = new w5.a0(0, w5Var.q(), e8.class, "onTakePhotoOptionPicked", "onTakePhotoOptionPicked()V", 0);
                yx7Var.L = new w5.b0(0, w5Var.q(), e8.class, "onPickImageFromGalleryOptionPicked", "onPickImageFromGalleryOptionPicked()V", 0);
                return yx7Var;
            }
        });
        w9<String> w9VarRegisterForActivityResult = registerForActivityResult(new q9(), new n9() { // from class: v5
            @Override // defpackage.n9
            public final void a(Object obj) {
                Uri uri = (Uri) obj;
                w5.a aVar = w5.Companion;
                if (uri != null) {
                    e8 e8VarQ = this.t.q();
                    e8VarQ.e(b5.b.a);
                    oy0.d(rhb.b(e8VarQ), null, null, new k8(e8VarQ, uri, null), 3);
                }
            }
        });
        w9VarRegisterForActivityResult.getClass();
        this.D = w9VarRegisterForActivityResult;
        w9<Uri> w9VarRegisterForActivityResult2 = registerForActivityResult(new v9(), new n9() { // from class: k5
            @Override // defpackage.n9
            public final void a(Object obj) {
                Boolean bool = (Boolean) obj;
                w5.a aVar = w5.Companion;
                bool.getClass();
                e8 e8VarQ = this.t.q();
                boolean zBooleanValue = bool.booleanValue();
                Uri uri = e8VarQ.I;
                if (uri != null && zBooleanValue) {
                    e8VarQ.e(b5.b.a);
                    oy0.d(rhb.b(e8VarQ), null, null, new k8(e8VarQ, uri, null), 3);
                }
            }
        });
        w9VarRegisterForActivityResult2.getClass();
        this.E = w9VarRegisterForActivityResult2;
    }

    @Override // defpackage.hk0
    public final void i() {
        getChildFragmentManager().f0("REQUEST_KEY_PICK_COUNTRY_DIALOG", getViewLifecycleOwner(), new pf4() { // from class: j5
            @Override // defpackage.pf4
            public final void d(Bundle bundle, String str) {
                w5.a aVar = w5.Companion;
                String string = bundle.getString("selected_country_code");
                if (string == null) {
                    z90.a("Required value was null.");
                    return;
                }
                e8 e8VarQ = this.t.q();
                e8VarQ.getClass();
                e8VarQ.e(b5.b.a);
                String displayCountry = new Locale(BuildConfig.FLAVOR, string).getDisplayCountry();
                displayCountry.getClass();
                oy0.d(rhb.b(e8VarQ), null, null, new h8(e8VarQ, string, new l5b(string, displayCountry), null), 3);
            }
        });
        getChildFragmentManager().f0("REQUEST_KEY_CHANGE_PASSWORD_DIALOG", getViewLifecycleOwner(), new pf4() { // from class: n5
            @Override // defpackage.pf4
            public final void d(Bundle bundle, String str) {
                w5.a aVar = w5.Companion;
                int iOrdinal = o81.b.values()[bundle.getInt("ARG_ACTION_TYPE")].ordinal();
                w5 w5Var = this.t;
                if (iOrdinal == 0) {
                    e8 e8VarQ = w5Var.q();
                    e8VarQ.f(new i5.k(e8VarQ.F.b(R.string.password_successfully_updated, new Object[0])));
                } else {
                    if (iOrdinal != 1) {
                        u.b();
                        return;
                    }
                    e8 e8VarQ2 = w5Var.q();
                    e8VarQ2.getClass();
                    e8VarQ2.f(i5.i.b);
                }
            }
        });
        getChildFragmentManager().f0("REQUEST_KEY_FORGOT_PASSWORD_DIALOG", getViewLifecycleOwner(), new pf4() { // from class: r5
            @Override // defpackage.pf4
            public final void d(Bundle bundle, String str) {
                w5.a aVar = w5.Companion;
                String string = bundle.getString("ARG_MESSAGE");
                if (string == null) {
                    z90.a("Required value was null.");
                    return;
                }
                e8 e8VarQ = this.t.q();
                e8VarQ.getClass();
                e8VarQ.f(new i5.k(string));
            }
        });
        zd4 zd4VarP = p();
        xgb.a(zd4VarP.f, new c(null));
        xgb.a(zd4VarP.h, new d(null));
        xgb.a(zd4VarP.k, new e(null));
        xgb.a(zd4VarP.m, new f(null));
        xgb.a(zd4VarP.c, new g(null));
        xgb.a(zd4VarP.i, new h(null));
        xgb.a(zd4VarP.l, new i(null));
        xgb.a(zd4VarP.d, new j(null));
        xgb.a(zd4VarP.g, new k(null));
        xgb.a(zd4VarP.e, new b(null));
        zd4VarP.o.setNavigationOnClickListener(new View.OnClickListener() { // from class: s5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w5.a aVar = w5.Companion;
                this.t.q().x.a();
            }
        });
    }

    @Override // defpackage.hk0
    public final void j() {
        q().x.a();
    }

    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        View view2 = getView();
        if (view2 != null) {
            ee5.a(new l5(), view2);
        }
        e8 e8VarQ = q();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        e8VarQ.c(viewLifecycleOwner, new m5(0, this));
        q().J.e(getViewLifecycleOwner(), new x5(new m()));
        q().K.e(getViewLifecycleOwner(), new x5(new n()));
        q().L.e(getViewLifecycleOwner(), new x5(new o(new x(p().f, hhb.class, "isVisible", "isVisible(Landroid/view/View;)Z", 1))));
        q().M.e(getViewLifecycleOwner(), new x5(new p(new y(p().k, PickedOptionTextView.class, "pickedOptionText", "getPickedOptionText()Ljava/lang/String;", 0))));
        q().N.e(getViewLifecycleOwner(), new x5(new q(new z(p().m, PickedOptionTextView.class, "pickedOptionText", "getPickedOptionText()Ljava/lang/String;", 0))));
        q().O.e(getViewLifecycleOwner(), new x5(new r()));
        q().P.e(getViewLifecycleOwner(), new x5(new s(new v(p().c, PickedOptionTextView.class, "pickedOptionText", "getPickedOptionText()Ljava/lang/String;", 0))));
        q().R.e(getViewLifecycleOwner(), new x5(new t(new w(p().l, PickedOptionTextView.class, "pickedOptionText", "getPickedOptionText()Ljava/lang/String;", 0))));
        q().Q.e(getViewLifecycleOwner(), new x5(new u()));
        q().S.e(getViewLifecycleOwner(), new x5(new l(p().j)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zd4 p() {
        return (zd4) this.A.a(this, F[0]);
    }

    public final e8 q() {
        return (e8) this.B.getValue();
    }
}
