package com.hwpo_training_app.host.presentation;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.d;
import androidx.media3.ui.PlayerView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import com.hwpo_training_app.host.presentation.HostActivity;
import com.hwpo_training_app.host.presentation.HostActivity.b;
import defpackage.a25;
import defpackage.ay9;
import defpackage.by9;
import defpackage.dq1;
import defpackage.e25;
import defpackage.egb;
import defpackage.eo4;
import defpackage.f9;
import defpackage.fib;
import defpackage.fo4;
import defpackage.g2b;
import defpackage.ho5;
import defpackage.id7;
import defpackage.j25;
import defpackage.jmb;
import defpackage.ki7;
import defpackage.kp2;
import defpackage.lb2;
import defpackage.ll8;
import defpackage.mh4;
import defpackage.mp2;
import defpackage.n20;
import defpackage.ne;
import defpackage.ne8;
import defpackage.o7a;
import defpackage.oe;
import defpackage.oh4;
import defpackage.oy0;
import defpackage.p15;
import defpackage.pa;
import defpackage.pb3;
import defpackage.px4;
import defpackage.q15;
import defpackage.q87;
import defpackage.r15;
import defpackage.rhb;
import defpackage.s28;
import defpackage.shb;
import defpackage.thb;
import defpackage.vhb;
import defpackage.vn2;
import defpackage.x15;
import defpackage.xj5;
import defpackage.xz7;
import defpackage.y15;
import defpackage.z15;
import defpackage.z25;
import defpackage.zn9;
import defpackage.zx9;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.carousel.ActionType;
import j$.time.LocalDate;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class HostActivity extends px4 implements zn9 {
    public static final /* synthetic */ ho5<Object>[] K = {new ne8(HostActivity.class, "binding", "getBinding()Lcom/hwpo_training_app/host/databinding/ActivityHostBinding;", 0)};
    public final o7a D;
    public final o7a E;
    public boolean I;
    public q87 x;
    public vn2 y;
    public final int z = R.id.rootContainer;
    public final shb A = new shb(ll8.a(e25.class), new e(), new d(), new f());
    public final o7a B = new o7a(new pb3(1, this));
    public final pa C = new pa(new c());
    public final o7a F = new o7a(new mh4() { // from class: s15
        @Override // defpackage.mh4
        public final Object invoke() {
            ho5<Object>[] ho5VarArr = HostActivity.K;
            HostActivity hostActivity = this.t;
            return new z25(hostActivity.getColor(R.color.alertErrorBackground), hostActivity.getColor(R.color.alertErrorText));
        }
    });
    public final o7a G = new o7a(new mh4() { // from class: t15
        @Override // defpackage.mh4
        public final Object invoke() {
            ho5<Object>[] ho5VarArr = HostActivity.K;
            HostActivity hostActivity = this.t;
            d dVarA = new ExoPlayer.b(hostActivity).a();
            dVarA.h0(co6.b(new Uri.Builder().scheme("android.resource").path(String.valueOf(R.raw.hwpo_video_splash)).build()));
            dVarA.n((s28.c) hostActivity.J.getValue());
            return dVarA;
        }
    });
    public final o7a H = new o7a(new mh4() { // from class: u15
        @Override // defpackage.mh4
        public final Object invoke() {
            ho5<Object>[] ho5VarArr = HostActivity.K;
            return Long.valueOf(this.t.getResources().getInteger(android.R.integer.config_shortAnimTime));
        }
    });
    public final o7a J = new o7a(new mh4() { // from class: v15
        @Override // defpackage.mh4
        public final Object invoke() {
            ho5<Object>[] ho5VarArr = HostActivity.K;
            return this.t.new b();
        }
    });

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[xz7.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[id7.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements s28.c {
        public b() {
        }

        @Override // s28.c
        public final void x(int i) {
            HostActivity hostActivity = HostActivity.this;
            o7a o7aVar = hostActivity.H;
            if (i != 3) {
                if (i != 4) {
                    g2b g2bVar = g2b.a;
                    return;
                } else {
                    ho5<Object>[] ho5VarArr = HostActivity.K;
                    hostActivity.w().d.animate().alpha(0.0f).setDuration(((Number) o7aVar.getValue()).longValue()).withEndAction(new y15(0, hostActivity));
                    return;
                }
            }
            ho5<Object>[] ho5VarArr2 = HostActivity.K;
            PlayerView playerView = hostActivity.w().d;
            playerView.setAlpha(0.0f);
            playerView.setVisibility(0);
            hostActivity.x().h();
            playerView.animate().alpha(1.0f).setDuration(((Number) o7aVar.getValue()).longValue()).withEndAction(new x15(0, hostActivity));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements oh4<dq1, f9> {
        @Override // defpackage.oh4
        public final f9 invoke(dq1 dq1Var) {
            dq1 dq1Var2 = dq1Var;
            dq1Var2.getClass();
            View viewFindViewById = dq1Var2.findViewById(R.id.container);
            viewFindViewById.getClass();
            return f9.bind(viewFindViewById);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d implements mh4<thb.c> {
        public d() {
        }

        @Override // defpackage.mh4
        public final thb.c invoke() {
            return HostActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e implements mh4<vhb> {
        public e() {
        }

        @Override // defpackage.mh4
        public final vhb invoke() {
            return HostActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f implements mh4<lb2> {
        public f() {
        }

        @Override // defpackage.mh4
        public final lb2 invoke() {
            return HostActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public HostActivity() {
        int i = 0;
        this.D = new o7a(new q15(i, this));
        this.E = new o7a(new r15(i, this));
    }

    public final void A() {
        y().R = xz7.v;
        x().a();
        this.I = false;
        w().d.setPlayer(null);
        w().d.setVisibility(8);
    }

    @Override // defpackage.zn9
    public final void b(String str) {
        str.getClass();
        View view = (View) this.D.getValue();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            ((z25) this.E.getValue()).c(str, viewGroup);
        }
    }

    @Override // defpackage.zn9
    public final void c(View view, String str) {
        str.getClass();
        if (view == null) {
            view = (View) this.D.getValue();
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            ((z25) this.F.getValue()).c(str, viewGroup);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [w15] */
    @Override // defpackage.px4, defpackage.tj0, androidx.fragment.app.g, defpackage.dq1, defpackage.hq1, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ay9 zx9Var = Build.VERSION.SDK_INT >= 31 ? new zx9(this) : new ay9(this);
        zx9Var.a();
        zx9Var.b(new by9() { // from class: w15
            @Override // defpackage.by9
            public final boolean a() {
                ho5<Object>[] ho5VarArr = HostActivity.K;
                HostActivity hostActivity = this.a;
                int iOrdinal = hostActivity.y().R.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            u.b();
                            return false;
                        }
                    } else if (!hostActivity.I) {
                    }
                    return false;
                }
                return true;
            }
        });
        zx9Var.c(new mp2());
        int i = 0;
        jmb.a(getWindow(), false);
        super.onCreate(bundle);
        e25 e25VarY = y();
        vn2 vn2Var = this.y;
        if (vn2Var == null) {
            xj5.e("deepLinkNavigator");
            throw null;
        }
        e25VarY.Q = vn2Var;
        getLifecycle().a(y());
        if (bundle == null) {
            Intent intent = getIntent();
            intent.getClass();
            z(intent, false);
        }
        y().c(this, new p15(i, this));
        y().S.e(this, new z15(new ne(new oe(0, w().b, SimpleProgressBar.class, "isVisible", "isVisible()Z", 1), 1)));
        FrameLayout frameLayout = w().a;
        kp2 kp2Var = new kp2(this);
        WeakHashMap<View, fib> weakHashMap = egb.a;
        egb.d.c(frameLayout, kp2Var);
    }

    @Override // defpackage.px4, defpackage.uy, androidx.fragment.app.g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        x().a();
    }

    @Override // defpackage.dq1, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        z(intent, true);
    }

    @Override // androidx.fragment.app.g, android.app.Activity
    public final void onPause() {
        super.onPause();
        q87 q87Var = this.x;
        if (q87Var != null) {
            q87Var.a();
        } else {
            xj5.e("navigatorHolder");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onRestoreInstanceState(bundle);
        y().R = xz7.v;
    }

    @Override // androidx.fragment.app.g
    public final void onResumeFragments() {
        super.onResumeFragments();
        q87 q87Var = this.x;
        if (q87Var != null) {
            q87Var.b((n20) this.B.getValue());
        } else {
            xj5.e("navigatorHolder");
            throw null;
        }
    }

    @Override // defpackage.uy, androidx.fragment.app.g, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (x().C()) {
            A();
        }
    }

    @Override // defpackage.tj0
    public final int u() {
        return this.z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f9 w() {
        return (f9) this.C.a(this, K[0]);
    }

    public final ExoPlayer x() {
        return (ExoPlayer) this.G.getValue();
    }

    public final e25 y() {
        return (e25) this.A.getValue();
    }

    public final void z(Intent intent, boolean z) {
        id7 id7VarA;
        Bundle extras;
        String string;
        Uri data;
        String host;
        LocalDate localDate;
        String queryParameter;
        Uri data2;
        String host2;
        if (xj5.a(intent.getAction(), "com.hwpo_training_app.core.multilanguage.data.LanguageChangedActions.REDIRECT_MAIN_TABS")) {
            e25.i(y(), false, null, null, null, false, 30);
            return;
        }
        if (xj5.a(intent.getAction(), "com.hwpo_training_app.core.multilanguage.data.LanguageChangedActions.REDIRECT_ONBOARDING_PAGE_ONE")) {
            e25.i(y(), false, null, ki7.t, null, false, 26);
            return;
        }
        if (xj5.a(intent.getAction(), "com.hwpo_training_app.core.multilanguage.data.LanguageChangedActions.REDIRECT_ONBOARDING_PAGE_TWO")) {
            e25.i(y(), false, null, ki7.u, null, false, 26);
            return;
        }
        if (xj5.a(intent.getAction(), "android.intent.action.MAIN") && !z) {
            e25.i(y(), true, null, null, null, false, 30);
            return;
        }
        if (xj5.a(intent.getAction(), "android.intent.action.VIEW") && (data2 = intent.getData()) != null && (host2 = data2.getHost()) != null && host2.equals(ActionType.LINK)) {
            androidx.fragment.app.f fragment = w().c.getFragment();
            Uri data3 = intent.getData();
            if (data3 != null) {
                e25 e25VarY = y();
                if (fragment == null) {
                    e25.i(e25VarY, false, null, null, null, false, 31);
                }
                String queryParameter2 = data3.getQueryParameter("url");
                if (queryParameter2 == null) {
                    return;
                }
                e25VarY.f(new a25(queryParameter2));
                return;
            }
            return;
        }
        String string2 = null;
        if (!xj5.a(intent.getAction(), "android.intent.action.VIEW") || (data = intent.getData()) == null || (host = data.getHost()) == null || !host.equals("schedule")) {
            if (xj5.a(intent.getAction(), "HWPO Client Action")) {
                Bundle extras2 = intent.getExtras();
                if (extras2 == null || (string = extras2.getString("NOTIFICATION_TYPE")) == null) {
                    id7VarA = null;
                } else {
                    id7.Companion.getClass();
                    id7VarA = id7.a.a(string);
                }
                if ((id7VarA == null ? -1 : a.a[id7VarA.ordinal()]) == 1 && (extras = intent.getExtras()) != null) {
                    string2 = extras.getString("NOTIFICATION_JSON");
                }
                e25.i(y(), false, string2, null, id7VarA, !z, 5);
                return;
            }
            return;
        }
        Uri data4 = intent.getData();
        if (data4 != null) {
            e25 e25VarY2 = y();
            String queryParameter3 = data4.getQueryParameter("id");
            if (queryParameter3 != null) {
                int i = Integer.parseInt(queryParameter3);
                String queryParameter4 = data4.getQueryParameter(AttributeType.DATE);
                if (queryParameter4 == null || (localDate = LocalDate.parse(queryParameter4)) == null || (queryParameter = data4.getQueryParameter("type")) == null) {
                    return;
                }
                String upperCase = queryParameter.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                fo4 fo4VarValueOf = fo4.valueOf(upperCase);
                if (fo4VarValueOf == null) {
                    return;
                }
                oy0.d(rhb.b(e25VarY2), null, null, new j25(e25VarY2, new eo4(i, localDate, fo4VarValueOf), null), 3);
            }
        }
    }
}
