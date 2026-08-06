package defpackage;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gz extends dz implements androidx.appcompat.view.menu.f.a, LayoutInflater.Factory2 {
    public static final ep9<String, Integer> B0 = new ep9<>();
    public static final int[] C0 = {R.attr.windowBackground};
    public static final boolean D0 = !"robolectric".equals(Build.FINGERPRINT);
    public OnBackInvokedCallback A0;
    public final Object C;
    public final Context D;
    public Window E;
    public j F;
    public final yy G;
    public q8 H;
    public r5a I;
    public CharSequence J;
    public qn2 K;
    public d L;
    public p M;
    public u8 N;
    public ActionBarContextView O;
    public PopupWindow P;
    public jz Q;
    public boolean T;
    public ViewGroup U;
    public TextView V;
    public View W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public o[] f0;
    public o g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public Configuration l0;
    public final int m0;
    public int n0;
    public int o0;
    public boolean p0;
    public m q0;
    public k r0;
    public boolean s0;
    public int t0;
    public boolean v0;
    public Rect w0;
    public Rect x0;
    public p00 y0;
    public OnBackInvokedDispatcher z0;
    public fib R = null;
    public final boolean S = true;
    public final a u0 = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            gz gzVar = gz.this;
            if ((gzVar.t0 & 1) != 0) {
                gzVar.L(0);
            }
            if ((gzVar.t0 & 4096) != 0) {
                gzVar.L(108);
            }
            gzVar.s0 = false;
            gzVar.t0 = 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b implements s8 {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface c {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class d implements androidx.appcompat.view.menu.j.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z) {
            gz.this.H(fVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            Window.Callback callback = gz.this.E.getCallback();
            if (callback == null) {
                return true;
            }
            callback.onMenuOpened(108, fVar);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class e implements u8.a {
        public final u8.a a;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a extends nq2 {
            public a() {
            }

            @Override // defpackage.hib
            public final void b() {
                gz gzVar = gz.this;
                gzVar.O.setVisibility(8);
                PopupWindow popupWindow = gzVar.P;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (gzVar.O.getParent() instanceof View) {
                    View view = (View) gzVar.O.getParent();
                    WeakHashMap<View, fib> weakHashMap = egb.a;
                    view.requestApplyInsets();
                }
                gzVar.O.h();
                gzVar.R.d(null);
                gzVar.R = null;
                ViewGroup viewGroup = gzVar.U;
                WeakHashMap<View, fib> weakHashMap2 = egb.a;
                viewGroup.requestApplyInsets();
            }
        }

        public e(u8.a aVar) {
            this.a = aVar;
        }

        @Override // u8.a
        public final boolean a(u8 u8Var, MenuItem menuItem) {
            return this.a.a(u8Var, menuItem);
        }

        @Override // u8.a
        public final void b(u8 u8Var) {
            this.a.b(u8Var);
            gz gzVar = gz.this;
            if (gzVar.P != null) {
                gzVar.E.getDecorView().removeCallbacks(gzVar.Q);
            }
            if (gzVar.O != null) {
                fib fibVar = gzVar.R;
                if (fibVar != null) {
                    fibVar.b();
                }
                fib fibVarB = egb.b(gzVar.O);
                fibVarB.a(0.0f);
                gzVar.R = fibVarB;
                fibVarB.d(new a());
            }
            yy yyVar = gzVar.G;
            if (yyVar != null) {
                yyVar.onSupportActionModeFinished(gzVar.N);
            }
            gzVar.N = null;
            ViewGroup viewGroup = gzVar.U;
            WeakHashMap<View, fib> weakHashMap = egb.a;
            viewGroup.requestApplyInsets();
            gzVar.Y();
        }

        @Override // u8.a
        public final boolean c(u8 u8Var, Menu menu) {
            return this.a.c(u8Var, menu);
        }

        @Override // u8.a
        public final boolean d(u8 u8Var, Menu menu) {
            ViewGroup viewGroup = gz.this.U;
            WeakHashMap<View, fib> weakHashMap = egb.a;
            viewGroup.requestApplyInsets();
            return this.a.d(u8Var, menu);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class f {
        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        public static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class g {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        public static bd6 b(Configuration configuration) {
            return bd6.a(configuration.getLocales().toLanguageTags());
        }

        public static void c(bd6 bd6Var) {
            LocaleList.setDefault(LocaleList.forLanguageTags(bd6Var.a.a.toLanguageTags()));
        }

        public static void d(Configuration configuration, bd6 bd6Var) {
            configuration.setLocales(LocaleList.forLanguageTags(bd6Var.a.a.toLanguageTags()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class h {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode & 3;
            if (i != i2) {
                configuration3.colorMode |= i2;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode & 12;
            if (i3 != i4) {
                configuration3.colorMode |= i4;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class i {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Object obj, final gz gzVar) {
            Objects.requireNonNull(gzVar);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: pz
                public final void onBackInvoked() {
                    gzVar.T();
                }
            };
            oz.a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        public static void c(Object obj, Object obj2) {
            oz.a(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class k extends l {
        public final PowerManager c;

        public k(Context context) {
            super();
            this.c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // gz.l
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // gz.l
        public final int c() {
            return f.a(this.c) ? 2 : 1;
        }

        @Override // gz.l
        public final void d() throws IllegalAccessException {
            gz.this.D(true, true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public abstract class l {
        public a a;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                l.this.d();
            }
        }

        public l() {
        }

        public final void a() {
            a aVar = this.a;
            if (aVar != null) {
                try {
                    gz.this.D.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public final void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB.countActions() == 0) {
                return;
            }
            if (this.a == null) {
                this.a = new a();
            }
            gz.this.D.registerReceiver(this.a, intentFilterB);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class m extends l {
        public final zya c;

        public m(zya zyaVar) {
            super();
            this.c = zyaVar;
        }

        @Override // gz.l
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // gz.l
        public final int c() {
            Location location;
            boolean z;
            long j;
            Location lastKnownLocation;
            zya zyaVar = this.c;
            zya.a aVar = zyaVar.c;
            LocationManager locationManager = zyaVar.b;
            if (aVar.b > System.currentTimeMillis()) {
                z = aVar.a;
            } else {
                Context context = zyaVar.a;
                Location lastKnownLocation2 = null;
                if (ty.b(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    try {
                        lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                    } catch (Exception e) {
                        Log.d("TwilightManager", "Failed to get last known location", e);
                    }
                    location = lastKnownLocation;
                } else {
                    location = null;
                }
                if (ty.b(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    try {
                        if (locationManager.isProviderEnabled("gps")) {
                            lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                        }
                    } catch (Exception e2) {
                        Log.d("TwilightManager", "Failed to get last known location", e2);
                    }
                }
                if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                    location = lastKnownLocation2;
                }
                z = false;
                if (location != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (yya.d == null) {
                        yya.d = new yya();
                    }
                    yya yyaVar = yya.d;
                    yyaVar.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                    yyaVar.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                    z = yyaVar.c == 1;
                    long j2 = yyaVar.b;
                    long j3 = yyaVar.a;
                    yyaVar.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                    long j4 = yyaVar.b;
                    if (j2 == -1 || j3 == -1) {
                        j = jCurrentTimeMillis + 43200000;
                    } else {
                        if (jCurrentTimeMillis > j3) {
                            j2 = j4;
                        } else if (jCurrentTimeMillis > j2) {
                            j2 = j3;
                        }
                        j = j2 + 60000;
                    }
                    aVar.a = z;
                    aVar.b = j;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i = Calendar.getInstance().get(11);
                    if (i < 6 || i >= 22) {
                        z = true;
                    }
                }
            }
            return z ? 2 : 1;
        }

        @Override // gz.l
        public final void d() throws IllegalAccessException {
            gz.this.D(true, true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class n extends ContentFrameLayout {
        public n(p02 p02Var) {
            super(p02Var);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return gz.this.K(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    gz gzVar = gz.this;
                    gzVar.I(gzVar.P(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i) {
            setBackgroundDrawable(e00.b(getContext(), i));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class o {
        public int a;
        public int b;
        public int c;
        public int d;
        public n e;
        public View f;
        public View g;
        public androidx.appcompat.view.menu.f h;
        public androidx.appcompat.view.menu.d i;
        public p02 j;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n;
        public boolean o;
        public Bundle p;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class p implements androidx.appcompat.view.menu.j.a {
        public p() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z) {
            o oVar;
            androidx.appcompat.view.menu.f fVarK = fVar.k();
            int i = 0;
            boolean z2 = fVarK != fVar;
            if (z2) {
                fVar = fVarK;
            }
            gz gzVar = gz.this;
            o[] oVarArr = gzVar.f0;
            int length = oVarArr != null ? oVarArr.length : 0;
            while (true) {
                if (i < length) {
                    oVar = oVarArr[i];
                    if (oVar != null && oVar.h == fVar) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    oVar = null;
                    break;
                }
            }
            if (oVar != null) {
                if (!z2) {
                    gzVar.I(oVar, z);
                } else {
                    gzVar.G(oVar.a, oVar, fVarK);
                    gzVar.I(oVar, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            Window.Callback callback;
            if (fVar != fVar.k()) {
                return true;
            }
            gz gzVar = gz.this;
            if (!gzVar.Z || (callback = gzVar.E.getCallback()) == null || gzVar.k0) {
                return true;
            }
            callback.onMenuOpened(108, fVar);
            return true;
        }
    }

    public gz(Context context, Window window, yy yyVar, Object obj) {
        uy uyVar = null;
        this.m0 = -100;
        this.D = context;
        this.G = yyVar;
        this.C = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof uy)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    uyVar = (uy) context;
                    break;
                }
            }
            if (uyVar != null) {
                this.m0 = uyVar.getDelegate().h();
            }
        }
        if (this.m0 == -100) {
            String name = this.C.getClass().getName();
            ep9<String, Integer> ep9Var = B0;
            Integer num = ep9Var.get(name);
            if (num != null) {
                this.m0 = num.intValue();
                ep9Var.remove(this.C.getClass().getName());
            }
        }
        if (window != null) {
            E(window);
        }
        tz.d();
    }

    public static bd6 F(Context context) {
        bd6 bd6Var;
        bd6 bd6Var2;
        if (Build.VERSION.SDK_INT >= 33 || (bd6Var = dz.v) == null) {
            return null;
        }
        bd6 bd6VarB = g.b(context.getApplicationContext().getResources().getConfiguration());
        LocaleList localeList = bd6Var.a.a;
        if (localeList.isEmpty()) {
            bd6Var2 = bd6.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i2 = 0;
            while (i2 < bd6VarB.a.a.size() + localeList.size()) {
                Locale locale = i2 < localeList.size() ? localeList.get(i2) : bd6VarB.a.a.get(i2 - localeList.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i2++;
            }
            bd6Var2 = new bd6(new dd6(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return bd6Var2.a.a.isEmpty() ? bd6VarB : bd6Var2;
    }

    public static Configuration J(Context context, int i2, bd6 bd6Var, Configuration configuration, boolean z) {
        int i3;
        if (i2 == 1) {
            i3 = 16;
        } else if (i2 != 2) {
            i3 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i3 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (bd6Var != null) {
            g.d(configuration2, bd6Var);
        }
        return configuration2;
    }

    @Override // defpackage.dz
    public final void A(int i2) {
        this.n0 = i2;
    }

    @Override // defpackage.dz
    public final void B(CharSequence charSequence) {
        this.J = charSequence;
        qn2 qn2Var = this.K;
        if (qn2Var != null) {
            qn2Var.setWindowTitle(charSequence);
            return;
        }
        q8 q8Var = this.H;
        if (q8Var != null) {
            q8Var.o(charSequence);
            return;
        }
        TextView textView = this.V;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // defpackage.dz
    public final u8 C(u8.a aVar) {
        u8 u8VarOnWindowStartingSupportActionMode;
        ViewGroup viewGroup;
        if (aVar == null) {
            z90.a("ActionMode callback can not be null.");
            return null;
        }
        u8 u8Var = this.N;
        if (u8Var != null) {
            u8Var.c();
        }
        e eVar = new e(aVar);
        Q();
        q8 q8Var = this.H;
        yy yyVar = this.G;
        if (q8Var != null) {
            u8 u8VarP = q8Var.p(eVar);
            this.N = u8VarP;
            if (u8VarP != null && yyVar != null) {
                yyVar.onSupportActionModeStarted(u8VarP);
            }
        }
        if (this.N == null) {
            fib fibVar = this.R;
            if (fibVar != null) {
                fibVar.b();
            }
            u8 u8Var2 = this.N;
            if (u8Var2 != null) {
                u8Var2.c();
            }
            if (yyVar == null || this.k0) {
                u8VarOnWindowStartingSupportActionMode = null;
            } else {
                try {
                    u8VarOnWindowStartingSupportActionMode = yyVar.onWindowStartingSupportActionMode(eVar);
                } catch (AbstractMethodError unused) {
                    u8VarOnWindowStartingSupportActionMode = null;
                }
            }
            if (u8VarOnWindowStartingSupportActionMode != null) {
                this.N = u8VarOnWindowStartingSupportActionMode;
            } else {
                if (this.O == null) {
                    boolean z = this.c0;
                    Context context = this.D;
                    if (z) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.hwpo_training_app.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            p02 p02Var = new p02(context, 0);
                            p02Var.getTheme().setTo(themeNewTheme);
                            context = p02Var;
                        }
                        this.O = new ActionBarContextView(context);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, com.hwpo_training_app.R.attr.actionModePopupWindowStyle);
                        this.P = popupWindow;
                        popupWindow.setWindowLayoutType(2);
                        this.P.setContentView(this.O);
                        this.P.setWidth(-1);
                        context.getTheme().resolveAttribute(com.hwpo_training_app.R.attr.actionBarSize, typedValue, true);
                        this.O.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.P.setHeight(-2);
                        this.Q = new jz(this);
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.U.findViewById(com.hwpo_training_app.R.id.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            Q();
                            q8 q8Var2 = this.H;
                            Context contextE = q8Var2 != null ? q8Var2.e() : null;
                            if (contextE != null) {
                                context = contextE;
                            }
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                            this.O = (ActionBarContextView) viewStubCompat.a();
                        }
                    }
                }
                if (this.O != null) {
                    fib fibVar2 = this.R;
                    if (fibVar2 != null) {
                        fibVar2.b();
                    }
                    this.O.h();
                    Context context2 = this.O.getContext();
                    ActionBarContextView actionBarContextView = this.O;
                    cz9 cz9Var = new cz9();
                    cz9Var.v = context2;
                    cz9Var.w = actionBarContextView;
                    cz9Var.x = eVar;
                    androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(actionBarContextView.getContext());
                    fVar.l = 1;
                    cz9Var.A = fVar;
                    fVar.e = cz9Var;
                    if (eVar.a.c(cz9Var, fVar)) {
                        cz9Var.i();
                        this.O.f(cz9Var);
                        this.N = cz9Var;
                        boolean z2 = this.T && (viewGroup = this.U) != null && viewGroup.isLaidOut();
                        ActionBarContextView actionBarContextView2 = this.O;
                        if (z2) {
                            actionBarContextView2.setAlpha(0.0f);
                            fib fibVarB = egb.b(this.O);
                            fibVarB.a(1.0f);
                            this.R = fibVarB;
                            fibVarB.d(new kz(this));
                        } else {
                            actionBarContextView2.setAlpha(1.0f);
                            this.O.setVisibility(0);
                            if (this.O.getParent() instanceof View) {
                                View view = (View) this.O.getParent();
                                WeakHashMap<View, fib> weakHashMap = egb.a;
                                view.requestApplyInsets();
                            }
                        }
                        if (this.P != null) {
                            this.E.getDecorView().post(this.Q);
                        }
                    } else {
                        this.N = null;
                    }
                }
            }
            u8 u8Var3 = this.N;
            if (u8Var3 != null && yyVar != null) {
                yyVar.onSupportActionModeStarted(u8Var3);
            }
            Y();
            this.N = this.N;
        }
        Y();
        return this.N;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00f9  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean D(boolean z, boolean z2) throws IllegalAccessException {
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        Object obj;
        Object obj2;
        if (this.k0) {
            return false;
        }
        int i3 = this.m0;
        if (i3 == -100) {
            i3 = dz.u;
        }
        Context context = this.D;
        int iS = S(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        bd6 bd6VarF = i4 < 33 ? F(context) : null;
        if (!z2 && bd6VarF != null) {
            bd6VarF = g.b(context.getResources().getConfiguration());
        }
        Configuration configurationJ = J(context, iS, bd6VarF, null, false);
        boolean z6 = this.p0;
        Object obj3 = this.C;
        if (z6 || !(obj3 instanceof Activity)) {
            this.p0 = true;
            i2 = this.o0;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i2 = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i4 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.o0 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                    this.o0 = 0;
                }
                this.p0 = true;
                i2 = this.o0;
            }
        }
        Configuration configuration = this.l0;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i5 = configuration.uiMode & 48;
        int i6 = configurationJ.uiMode & 48;
        bd6 bd6VarB = g.b(configuration);
        bd6 bd6VarB2 = bd6VarF == null ? null : g.b(configurationJ);
        int i7 = i5 != i6 ? 512 : 0;
        if (bd6VarB2 != null && !bd6VarB.equals(bd6VarB2)) {
            i7 |= 8196;
        }
        if (((~i2) & i7) != 0 && z && this.i0 && ((D0 || this.j0) && (obj3 instanceof Activity))) {
            final Activity activity = (Activity) obj3;
            if (activity.isChild()) {
                z3 = false;
            } else {
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 31 && (i7 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationJ.getLayoutDirection());
                }
                if (i8 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new Runnable() { // from class: b9
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r3v1 */
                        /* JADX WARN: Type inference failed for: r3v10 */
                        /* JADX WARN: Type inference failed for: r3v2 */
                        /* JADX WARN: Type inference failed for: r3v3 */
                        /* JADX WARN: Type inference failed for: r3v4, types: [android.app.Application] */
                        /* JADX WARN: Type inference failed for: r3v5 */
                        /* JADX WARN: Type inference failed for: r3v9 */
                        /* JADX WARN: Type inference failed for: r4v1 */
                        /* JADX WARN: Type inference failed for: r4v2 */
                        /* JADX WARN: Type inference failed for: r4v3, types: [l9$a] */
                        /* JADX WARN: Type inference failed for: r4v4 */
                        /* JADX WARN: Type inference failed for: r4v5 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object obj4;
                            ?? r4;
                            ?? r3;
                            Activity activity2 = activity;
                            if (activity2.isFinishing()) {
                                return;
                            }
                            Handler handler = l9.g;
                            Method method = l9.f;
                            int i9 = Build.VERSION.SDK_INT;
                            if (i9 >= 28) {
                                activity2.recreate();
                                return;
                            }
                            l9.a aVar = 27;
                            if (((i9 != 26 && i9 != 27) || method != null) && (l9.e != null || l9.d != null)) {
                                try {
                                    Object obj5 = l9.c.get(activity2);
                                    if (obj5 != null && (obj4 = l9.b.get(activity2)) != null) {
                                        Application application = activity2.getApplication();
                                        aVar = new l9.a(activity2);
                                        application.registerActivityLifecycleCallbacks(aVar);
                                        handler.post(new i9(aVar, obj5));
                                        application = (i9 == 26 || i9 == 27) ? 1 : 0;
                                        try {
                                            if (application != 0) {
                                                try {
                                                    Boolean bool = Boolean.FALSE;
                                                    method.invoke(obj4, obj5, null, null, 0, bool, null, null, bool, bool);
                                                } catch (Throwable th) {
                                                    th = th;
                                                    r3 = application;
                                                    r4 = aVar;
                                                    handler.post(new j9(r3, r4));
                                                    throw th;
                                                }
                                            } else {
                                                activity2.recreate();
                                            }
                                            handler.post(new j9(application, aVar));
                                            return;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r3 = application;
                                            r4 = aVar;
                                        }
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                            activity2.recreate();
                        }
                    });
                }
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i7 == 0) {
            z4 = z3;
        } else {
            boolean z7 = (i2 & i7) == i7;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i6;
            if (bd6VarB2 != null) {
                g.d(configuration2, bd6VarB2);
            }
            resources.updateConfiguration(configuration2, null);
            int i9 = Build.VERSION.SDK_INT;
            if (i9 < 26 && i9 < 28) {
                if (!nu8.h) {
                    try {
                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                        nu8.g = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e3);
                    }
                    nu8.h = true;
                }
                Field field = nu8.g;
                if (field != null) {
                    try {
                        obj = field.get(resources);
                    } catch (IllegalAccessException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e4);
                        obj = null;
                    }
                    if (obj != null) {
                        if (!nu8.b) {
                            try {
                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                nu8.a = declaredField2;
                                declaredField2.setAccessible(true);
                            } catch (NoSuchFieldException e5) {
                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e5);
                            }
                            nu8.b = true;
                        }
                        Field field2 = nu8.a;
                        if (field2 != null) {
                            try {
                                obj2 = field2.get(obj);
                            } catch (IllegalAccessException e6) {
                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e6);
                                obj2 = null;
                            }
                        } else {
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            if (!nu8.d) {
                                try {
                                    nu8.c = Class.forName("android.content.res.ThemedResourceCache");
                                } catch (ClassNotFoundException e7) {
                                    Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e7);
                                }
                                nu8.d = true;
                            }
                            Class<?> cls = nu8.c;
                            if (cls != null) {
                                if (!nu8.f) {
                                    try {
                                        Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                        nu8.e = declaredField3;
                                        declaredField3.setAccessible(true);
                                    } catch (NoSuchFieldException e8) {
                                        Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e8);
                                    }
                                    nu8.f = true;
                                }
                                Field field3 = nu8.e;
                                if (field3 != null) {
                                    try {
                                        longSparseArray = (LongSparseArray) field3.get(obj2);
                                    } catch (IllegalAccessException e9) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e9);
                                    }
                                    if (longSparseArray != null) {
                                        longSparseArray.clear();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i10 = this.n0;
            if (i10 != 0) {
                context.setTheme(i10);
                z5 = true;
                context.getTheme().applyStyle(this.n0, true);
            } else {
                z5 = true;
            }
            if (z7 && (obj3 instanceof Activity)) {
                Activity activity2 = (Activity) obj3;
                if (activity2 instanceof m76) {
                    if (((m76) activity2).getLifecycle().b().compareTo(s66.b.v) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.j0 && !this.k0) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
            z4 = z5;
        }
        if (z4 && (obj3 instanceof uy)) {
            if ((i7 & 512) != 0) {
                ((uy) obj3).onNightModeChanged(iS);
            }
            if ((i7 & 4) != 0) {
                ((uy) obj3).onLocalesChanged(bd6VarF);
            }
        }
        if (bd6VarB2 != null) {
            g.c(g.b(context.getResources().getConfiguration()));
        }
        if (i3 == 0) {
            O(context).e();
        } else {
            m mVar = this.q0;
            if (mVar != null) {
                mVar.a();
            }
        }
        k kVar = this.r0;
        if (i3 == 3) {
            if (kVar == null) {
                this.r0 = new k(context);
            }
            this.r0.e();
        } else if (kVar != null) {
            kVar.a();
        }
        return z4;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    public final void E(Window window) {
        Drawable drawableE;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.E != null) {
            aa0.c("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof j) {
            aa0.c("AppCompat has already installed itself into the Window");
            return;
        }
        j jVar = new j(callback);
        this.F = jVar;
        window.setCallback(jVar);
        Context context = this.D;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C0);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableE = null;
        } else {
            tz tzVarA = tz.a();
            synchronized (tzVarA) {
                drawableE = tzVarA.a.e(context, resourceId, true);
            }
        }
        if (drawableE != null) {
            window.setBackgroundDrawable(drawableE);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.E = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.z0) != null) {
            return;
        }
        Object obj = this.C;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.A0) != null) {
            i.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.A0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.z0 = i.a(activity);
            } else {
                this.z0 = null;
            }
        } else {
            this.z0 = null;
        }
        Y();
    }

    public final void G(int i2, o oVar, androidx.appcompat.view.menu.f fVar) {
        if (fVar == null) {
            if (oVar == null && i2 >= 0) {
                o[] oVarArr = this.f0;
                if (i2 < oVarArr.length) {
                    oVar = oVarArr[i2];
                }
            }
            if (oVar != null) {
                fVar = oVar.h;
            }
        }
        if ((oVar == null || oVar.m) && !this.k0) {
            j jVar = this.F;
            Window.Callback callback = this.E.getCallback();
            jVar.getClass();
            try {
                jVar.x = true;
                callback.onPanelClosed(i2, fVar);
            } finally {
                jVar.x = false;
            }
        }
    }

    public final void H(androidx.appcompat.view.menu.f fVar) {
        if (this.e0) {
            return;
        }
        this.e0 = true;
        this.K.i();
        Window.Callback callback = this.E.getCallback();
        if (callback != null && !this.k0) {
            callback.onPanelClosed(108, fVar);
        }
        this.e0 = false;
    }

    public final void I(o oVar, boolean z) {
        n nVar;
        qn2 qn2Var;
        if (z && oVar.a == 0 && (qn2Var = this.K) != null && qn2Var.b()) {
            H(oVar.h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.D.getSystemService("window");
        if (windowManager != null && oVar.m && (nVar = oVar.e) != null) {
            windowManager.removeView(nVar);
            if (z) {
                G(oVar.a, oVar, null);
            }
        }
        oVar.k = false;
        oVar.l = false;
        oVar.m = false;
        oVar.f = null;
        oVar.n = true;
        if (this.g0 == oVar) {
            this.g0 = null;
        }
        if (oVar.a == 0) {
            Y();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fe A[RETURN] */
    public final boolean K(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        o oVarP;
        qn2 qn2Var;
        Context context;
        boolean z;
        boolean zF;
        boolean zW;
        AudioManager audioManager;
        o oVarP2;
        Object obj = this.C;
        if ((!(obj instanceof oo5.a) && !(obj instanceof rz)) || (decorView = this.E.getDecorView()) == null || !oo5.a(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                j jVar = this.F;
                Window.Callback callback = this.E.getCallback();
                jVar.getClass();
                try {
                    jVar.w = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    jVar.w = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.h0 = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    oVarP2 = P(0);
                                    if (!oVarP2.m) {
                                        W(oVarP2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.N == null) {
                                    oVarP = P(0);
                                    qn2Var = this.K;
                                    context = this.D;
                                    if (qn2Var != null || !qn2Var.d() || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                        z = oVarP.m;
                                        if (!z || oVarP.l) {
                                            I(oVarP, true);
                                            zF = z;
                                        } else if (oVarP.k) {
                                            if (oVarP.o) {
                                                oVarP.k = false;
                                                zW = W(oVarP, keyEvent);
                                            } else {
                                                zW = true;
                                            }
                                            if (zW) {
                                                U(oVarP, keyEvent);
                                                zF = true;
                                            } else {
                                                zF = false;
                                            }
                                        } else {
                                            zF = false;
                                        }
                                    } else if (this.K.b()) {
                                        zF = this.K.f();
                                    } else if (this.k0 || !W(oVarP, keyEvent)) {
                                        zF = false;
                                    } else {
                                        zF = this.K.g();
                                    }
                                    if (zF) {
                                        audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (T()) {
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    jVar.w = false;
                    throw th;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.h0 = (keyEvent.getFlags() & 128) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            oVarP2 = P(0);
                            if (!oVarP2.m) {
                                W(oVarP2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.N == null) {
                            oVarP = P(0);
                            qn2Var = this.K;
                            context = this.D;
                            if (qn2Var != null) {
                                z = oVarP.m;
                                if (z) {
                                    I(oVarP, true);
                                    zF = z;
                                } else {
                                    I(oVarP, true);
                                    zF = z;
                                }
                            } else {
                                z = oVarP.m;
                                if (z) {
                                    I(oVarP, true);
                                    zF = z;
                                } else {
                                    I(oVarP, true);
                                    zF = z;
                                }
                            }
                            if (zF) {
                                audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                if (audioManager != null) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (T()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void L(int i2) {
        o oVarP = P(i2);
        if (oVarP.h != null) {
            Bundle bundle = new Bundle();
            oVarP.h.t(bundle);
            if (bundle.size() > 0) {
                oVarP.p = bundle;
            }
            oVarP.h.w();
            oVarP.h.clear();
        }
        oVarP.o = true;
        oVarP.n = true;
        if ((i2 == 108 || i2 == 0) && this.K != null) {
            o oVarP2 = P(0);
            oVarP2.k = false;
            W(oVarP2, null);
        }
    }

    public final void M() {
        ViewGroup viewGroup;
        if (this.T) {
            return;
        }
        Context context = this.D;
        int[] iArr = ph8.j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            aa0.c("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            v(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            v(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            v(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            v(10);
        }
        this.c0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        N();
        this.E.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.d0) {
            viewGroup = this.b0 ? (ViewGroup) layoutInflaterFrom.inflate(com.hwpo_training_app.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.hwpo_training_app.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.c0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.hwpo_training_app.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.a0 = false;
            this.Z = false;
        } else if (this.Z) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.hwpo_training_app.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new p02(context, typedValue.resourceId) : context).inflate(com.hwpo_training_app.R.layout.abc_screen_toolbar, (ViewGroup) null);
            qn2 qn2Var = (qn2) viewGroup.findViewById(com.hwpo_training_app.R.id.decor_content_parent);
            this.K = qn2Var;
            qn2Var.setWindowCallback(this.E.getCallback());
            if (this.a0) {
                this.K.h(109);
            }
            if (this.X) {
                this.K.h(2);
            }
            if (this.Y) {
                this.K.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.Z);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.a0);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.c0);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.b0);
            sb.append(", windowNoTitle: ");
            z90.a(fz.c(sb, this.d0, " }"));
            return;
        }
        hz hzVar = new hz(this);
        WeakHashMap<View, fib> weakHashMap = egb.a;
        egb.d.c(viewGroup, hzVar);
        if (this.K == null) {
            this.V = (TextView) viewGroup.findViewById(com.hwpo_training_app.R.id.title);
        }
        boolean z = yib.a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e3) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.hwpo_training_app.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.E.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.E.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new iz(this));
        this.U = viewGroup;
        Object obj = this.C;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.J;
        if (!TextUtils.isEmpty(title)) {
            qn2 qn2Var2 = this.K;
            if (qn2Var2 != null) {
                qn2Var2.setWindowTitle(title);
            } else {
                q8 q8Var = this.H;
                if (q8Var != null) {
                    q8Var.o(title);
                } else {
                    TextView textView = this.V;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.U.findViewById(R.id.content);
        View decorView = this.E.getDecorView();
        contentFrameLayout2.z.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.T = true;
        o oVarP = P(0);
        if (this.k0 || oVarP.h != null) {
            return;
        }
        R(108);
    }

    public final void N() {
        if (this.E == null) {
            Object obj = this.C;
            if (obj instanceof Activity) {
                E(((Activity) obj).getWindow());
            }
        }
        if (this.E != null) {
            return;
        }
        aa0.c("We have not been given a Window");
    }

    public final l O(Context context) {
        if (this.q0 == null) {
            if (zya.d == null) {
                Context applicationContext = context.getApplicationContext();
                zya.d = new zya(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.q0 = new m(zya.d);
        }
        return this.q0;
    }

    public final o P(int i2) {
        o[] oVarArr = this.f0;
        if (oVarArr == null || oVarArr.length <= i2) {
            o[] oVarArr2 = new o[i2 + 1];
            if (oVarArr != null) {
                System.arraycopy(oVarArr, 0, oVarArr2, 0, oVarArr.length);
            }
            this.f0 = oVarArr2;
            oVarArr = oVarArr2;
        }
        o oVar = oVarArr[i2];
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o();
        oVar2.a = i2;
        oVar2.n = false;
        oVarArr[i2] = oVar2;
        return oVar2;
    }

    public final void Q() {
        M();
        if (this.Z && this.H == null) {
            Object obj = this.C;
            if (obj instanceof Activity) {
                this.H = new lmb((Activity) obj, this.a0);
            } else if (obj instanceof Dialog) {
                this.H = new lmb((Dialog) obj);
            }
            q8 q8Var = this.H;
            if (q8Var != null) {
                q8Var.l(this.v0);
            }
        }
    }

    public final void R(int i2) {
        this.t0 = (1 << i2) | this.t0;
        if (this.s0) {
            return;
        }
        View decorView = this.E.getDecorView();
        WeakHashMap<View, fib> weakHashMap = egb.a;
        decorView.postOnAnimation(this.u0);
        this.s0 = true;
    }

    public final int S(Context context, int i2) {
        if (i2 != -100) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        if (i2 != 3) {
                            aa0.c("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        if (this.r0 == null) {
                            this.r0 = new k(context);
                        }
                        return this.r0.c();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return O(context).c();
                }
            }
            return i2;
        }
        return -1;
    }

    public final boolean T() {
        boolean z = this.h0;
        this.h0 = false;
        o oVarP = P(0);
        if (!oVarP.m) {
            u8 u8Var = this.N;
            if (u8Var != null) {
                u8Var.c();
                return true;
            }
            Q();
            q8 q8Var = this.H;
            if (q8Var == null || !q8Var.b()) {
                return false;
            }
        } else if (!z) {
            I(oVarP, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0175, code lost:
    
        if (r2.y.getCount() > 0) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U(gz.o r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gz.U(gz$o, android.view.KeyEvent):void");
    }

    public final boolean V(o oVar, int i2, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((oVar.k || W(oVar, keyEvent)) && (fVar = oVar.h) != null) {
            return fVar.performShortcut(i2, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00da  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:82:0x010f  */
    public final boolean W(o oVar, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        qn2 qn2Var;
        qn2 qn2Var2;
        Resources.Theme themeNewTheme;
        qn2 qn2Var3;
        qn2 qn2Var4;
        if (!this.k0) {
            boolean z = oVar.k;
            int i2 = oVar.a;
            if (z) {
                return true;
            }
            o oVar2 = this.g0;
            if (oVar2 != null && oVar2 != oVar) {
                I(oVar2, false);
            }
            Window.Callback callback = this.E.getCallback();
            if (callback != null) {
                oVar.g = callback.onCreatePanelView(i2);
            }
            boolean z2 = i2 == 0 || i2 == 108;
            if (z2 && (qn2Var4 = this.K) != null) {
                qn2Var4.c();
            }
            if (oVar.g == null && (!z2 || !(this.H instanceof kqa))) {
                androidx.appcompat.view.menu.f fVar2 = oVar.h;
                if (fVar2 == null || oVar.o) {
                    if (fVar2 == null) {
                        Context context = this.D;
                        if ((i2 == 0 || i2 == 108) && this.K != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.hwpo_training_app.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(com.hwpo_training_app.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(com.hwpo_training_app.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                p02 p02Var = new p02(context, 0);
                                p02Var.getTheme().setTo(themeNewTheme);
                                context = p02Var;
                            }
                        }
                        androidx.appcompat.view.menu.f fVar3 = new androidx.appcompat.view.menu.f(context);
                        fVar3.e = this;
                        androidx.appcompat.view.menu.f fVar4 = oVar.h;
                        if (fVar3 != fVar4) {
                            if (fVar4 != null) {
                                fVar4.r(oVar.i);
                            }
                            oVar.h = fVar3;
                            androidx.appcompat.view.menu.d dVar = oVar.i;
                            if (dVar != null) {
                                fVar3.b(dVar, fVar3.a);
                            }
                        }
                        if (oVar.h != null) {
                            if (z2 && (qn2Var2 = this.K) != null) {
                                if (this.L == null) {
                                    this.L = new d();
                                }
                                qn2Var2.a(oVar.h, this.L);
                            }
                            oVar.h.w();
                            if (callback.onCreatePanelMenu(i2, oVar.h)) {
                                oVar.o = false;
                            } else {
                                fVar = oVar.h;
                                if (fVar != null) {
                                    if (fVar != null) {
                                        fVar.r(oVar.i);
                                    }
                                    oVar.h = null;
                                }
                                if (z2 && (qn2Var = this.K) != null) {
                                    qn2Var.a(null, this.L);
                                }
                            }
                        }
                    } else {
                        if (z2) {
                            if (this.L == null) {
                                this.L = new d();
                            }
                            qn2Var2.a(oVar.h, this.L);
                        }
                        oVar.h.w();
                        if (callback.onCreatePanelMenu(i2, oVar.h)) {
                            fVar = oVar.h;
                            if (fVar != null) {
                                if (fVar != null) {
                                    fVar.r(oVar.i);
                                }
                                oVar.h = null;
                            }
                            if (z2) {
                                qn2Var.a(null, this.L);
                            }
                        } else {
                            oVar.o = false;
                        }
                    }
                }
                oVar.h.w();
                Bundle bundle = oVar.p;
                if (bundle != null) {
                    oVar.h.s(bundle);
                    oVar.p = null;
                }
                if (!callback.onPreparePanel(0, oVar.g, oVar.h)) {
                    if (z2 && (qn2Var3 = this.K) != null) {
                        qn2Var3.a(null, this.L);
                    }
                    oVar.h.v();
                    return false;
                }
                oVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                oVar.h.v();
            }
            oVar.k = true;
            oVar.l = false;
            this.g0 = oVar;
            return true;
        }
        return false;
    }

    public final void X() {
        if (this.T) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void Y() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.z0 != null && (P(0).m || this.N != null)) {
                z = true;
            }
            if (z && this.A0 == null) {
                this.A0 = i.b(this.z0, this);
            } else {
                if (z || (onBackInvokedCallback = this.A0) == null) {
                    return;
                }
                i.c(this.z0, onBackInvokedCallback);
                this.A0 = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        o oVar;
        Window.Callback callback = this.E.getCallback();
        if (callback != null && !this.k0) {
            androidx.appcompat.view.menu.f fVarK = fVar.k();
            o[] oVarArr = this.f0;
            int length = oVarArr != null ? oVarArr.length : 0;
            for (int i2 = 0; i2 < length; i2++) {
                oVar = oVarArr[i2];
                if (oVar != null && oVar.h == fVarK) {
                    if (oVar != null) {
                        return callback.onMenuItemSelected(oVar.a, menuItem);
                    }
                }
            }
            oVar = null;
            if (oVar != null) {
                return callback.onMenuItemSelected(oVar.a, menuItem);
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(androidx.appcompat.view.menu.f fVar) {
        qn2 qn2Var = this.K;
        if (qn2Var == null || !qn2Var.d() || (ViewConfiguration.get(this.D).hasPermanentMenuKey() && !this.K.e())) {
            o oVarP = P(0);
            oVarP.n = true;
            I(oVarP, false);
            U(oVarP, null);
            return;
        }
        Window.Callback callback = this.E.getCallback();
        if (this.K.b()) {
            this.K.f();
            if (this.k0) {
                return;
            }
            callback.onPanelClosed(108, P(0).h);
            return;
        }
        if (callback == null || this.k0) {
            return;
        }
        if (this.s0 && (1 & this.t0) != 0) {
            View decorView = this.E.getDecorView();
            a aVar = this.u0;
            decorView.removeCallbacks(aVar);
            aVar.run();
        }
        o oVarP2 = P(0);
        androidx.appcompat.view.menu.f fVar2 = oVarP2.h;
        if (fVar2 == null || oVarP2.o || !callback.onPreparePanel(0, oVarP2.g, fVar2)) {
            return;
        }
        callback.onMenuOpened(108, oVarP2.h);
        this.K.g();
    }

    @Override // defpackage.dz
    public final void c(View view, ViewGroup.LayoutParams layoutParams) {
        M();
        ((ViewGroup) this.U.findViewById(R.id.content)).addView(view, layoutParams);
        this.F.a(this.E.getCallback());
    }

    @Override // defpackage.dz
    public final Context d(Context context) {
        Configuration configuration;
        this.i0 = true;
        int i2 = this.m0;
        if (i2 == -100) {
            i2 = dz.u;
        }
        int iS = S(context, i2);
        int i3 = 0;
        if (dz.m(context) && dz.m(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (dz.B) {
                    try {
                        bd6 bd6Var = dz.v;
                        if (bd6Var == null) {
                            if (dz.w == null) {
                                dz.w = bd6.a(x10.f(context));
                            }
                            if (!dz.w.a.a.isEmpty()) {
                                dz.v = dz.w;
                            }
                        } else if (!bd6Var.equals(dz.w)) {
                            bd6 bd6Var2 = dz.v;
                            dz.w = bd6Var2;
                            x10.e(context, bd6Var2.a.a.toLanguageTags());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!dz.y) {
                dz.t.execute(new cz(i3, context));
            }
        }
        bd6 bd6VarF = F(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(J(context, iS, bd6VarF, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof p02) {
            try {
                ((p02) context).a(J(context, iS, bd6VarF, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!D0) {
            return context;
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (configuration3.equals(configuration4)) {
            configuration = null;
        } else {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f2 = configuration3.fontScale;
                float f3 = configuration4.fontScale;
                if (f2 != f3) {
                    configuration.fontScale = f3;
                }
                int i4 = configuration3.mcc;
                int i5 = configuration4.mcc;
                if (i4 != i5) {
                    configuration.mcc = i5;
                }
                int i6 = configuration3.mnc;
                int i7 = configuration4.mnc;
                if (i6 != i7) {
                    configuration.mnc = i7;
                }
                g.a(configuration3, configuration4, configuration);
                int i8 = configuration3.touchscreen;
                int i9 = configuration4.touchscreen;
                if (i8 != i9) {
                    configuration.touchscreen = i9;
                }
                int i10 = configuration3.keyboard;
                int i11 = configuration4.keyboard;
                if (i10 != i11) {
                    configuration.keyboard = i11;
                }
                int i12 = configuration3.keyboardHidden;
                int i13 = configuration4.keyboardHidden;
                if (i12 != i13) {
                    configuration.keyboardHidden = i13;
                }
                int i14 = configuration3.navigation;
                int i15 = configuration4.navigation;
                if (i14 != i15) {
                    configuration.navigation = i15;
                }
                int i16 = configuration3.navigationHidden;
                int i17 = configuration4.navigationHidden;
                if (i16 != i17) {
                    configuration.navigationHidden = i17;
                }
                int i18 = configuration3.orientation;
                int i19 = configuration4.orientation;
                if (i18 != i19) {
                    configuration.orientation = i19;
                }
                int i20 = configuration3.screenLayout & 15;
                int i21 = configuration4.screenLayout & 15;
                if (i20 != i21) {
                    configuration.screenLayout |= i21;
                }
                int i22 = configuration3.screenLayout & 192;
                int i23 = configuration4.screenLayout & 192;
                if (i22 != i23) {
                    configuration.screenLayout |= i23;
                }
                int i24 = configuration3.screenLayout & 48;
                int i25 = configuration4.screenLayout & 48;
                if (i24 != i25) {
                    configuration.screenLayout |= i25;
                }
                int i26 = configuration3.screenLayout & 768;
                int i27 = configuration4.screenLayout & 768;
                if (i26 != i27) {
                    configuration.screenLayout |= i27;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    h.a(configuration3, configuration4, configuration);
                }
                int i28 = configuration3.uiMode & 15;
                int i29 = configuration4.uiMode & 15;
                if (i28 != i29) {
                    configuration.uiMode |= i29;
                }
                int i30 = configuration3.uiMode & 48;
                int i31 = configuration4.uiMode & 48;
                if (i30 != i31) {
                    configuration.uiMode |= i31;
                }
                int i32 = configuration3.screenWidthDp;
                int i33 = configuration4.screenWidthDp;
                if (i32 != i33) {
                    configuration.screenWidthDp = i33;
                }
                int i34 = configuration3.screenHeightDp;
                int i35 = configuration4.screenHeightDp;
                if (i34 != i35) {
                    configuration.screenHeightDp = i35;
                }
                int i36 = configuration3.smallestScreenWidthDp;
                int i37 = configuration4.smallestScreenWidthDp;
                if (i36 != i37) {
                    configuration.smallestScreenWidthDp = i37;
                }
                int i38 = configuration3.densityDpi;
                int i39 = configuration4.densityDpi;
                if (i38 != i39) {
                    configuration.densityDpi = i39;
                }
            }
        }
        Configuration configurationJ = J(context, iS, bd6VarF, configuration, true);
        p02 p02Var = new p02(context, com.hwpo_training_app.R.style.Theme_AppCompat_Empty);
        p02Var.a(configurationJ);
        try {
            if (context.getTheme() != null) {
                Resources.Theme theme = p02Var.getTheme();
                if (Build.VERSION.SDK_INT >= 29) {
                    mu8.a(theme);
                } else {
                    synchronized (lu8.a) {
                        if (!lu8.c) {
                            try {
                                Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                lu8.b = declaredMethod;
                                declaredMethod.setAccessible(true);
                            } catch (NoSuchMethodException e2) {
                                Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                            }
                            lu8.c = true;
                        }
                        Method method = lu8.b;
                        if (method != null) {
                            try {
                                method.invoke(theme, null);
                            } catch (IllegalAccessException | InvocationTargetException e3) {
                                Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                                lu8.b = null;
                            }
                        }
                    }
                }
            }
        } catch (NullPointerException unused3) {
        }
        return p02Var;
    }

    @Override // defpackage.dz
    public final <T extends View> T e(int i2) {
        M();
        return (T) this.E.findViewById(i2);
    }

    @Override // defpackage.dz
    public final Context f() {
        return this.D;
    }

    @Override // defpackage.dz
    public final b g() {
        return new b();
    }

    @Override // defpackage.dz
    public final int h() {
        return this.m0;
    }

    @Override // defpackage.dz
    public final MenuInflater i() {
        if (this.I == null) {
            Q();
            q8 q8Var = this.H;
            this.I = new r5a(q8Var != null ? q8Var.e() : this.D);
        }
        return this.I;
    }

    @Override // defpackage.dz
    public final q8 j() {
        Q();
        return this.H;
    }

    @Override // defpackage.dz
    public final void k() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.D);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof gz) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.dz
    public final void l() {
        if (this.H != null) {
            Q();
            if (this.H.f()) {
                return;
            }
            R(0);
        }
    }

    @Override // defpackage.dz
    public final void n(Configuration configuration) throws IllegalAccessException {
        if (this.Z && this.T) {
            Q();
            q8 q8Var = this.H;
            if (q8Var != null) {
                q8Var.g();
            }
        }
        tz tzVarA = tz.a();
        Context context = this.D;
        synchronized (tzVarA) {
            zt8 zt8Var = tzVarA.a;
            synchronized (zt8Var) {
                we6<WeakReference<Drawable.ConstantState>> we6Var = zt8Var.b.get(context);
                if (we6Var != null) {
                    we6Var.a();
                }
            }
        }
        this.l0 = new Configuration(this.D.getResources().getConfiguration());
        D(false, false);
    }

    @Override // defpackage.dz
    public final void o() throws IllegalAccessException {
        String strC;
        this.i0 = true;
        D(false, true);
        N();
        Object obj = this.C;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strC = n77.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                q8 q8Var = this.H;
                if (q8Var == null) {
                    this.v0 = true;
                } else {
                    q8Var.l(true);
                }
            }
            synchronized (dz.A) {
                dz.u(this);
                dz.z.add(new WeakReference<>(this));
            }
        }
        this.l0 = new Configuration(this.D.getResources().getConfiguration());
        this.j0 = true;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View c00Var;
        View view2 = null;
        if (this.y0 == null) {
            int[] iArr = ph8.j;
            Context context2 = this.D;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.y0 = new p00();
            } else {
                try {
                    this.y0 = (p00) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.y0 = new p00();
                }
            }
        }
        p00 p00Var = this.y0;
        int i2 = xcb.a;
        p00Var.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, ph8.y, 0, 0);
        byte b2 = 4;
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        Context p02Var = (resourceId == 0 || ((context instanceof p02) && ((p02) context).a == resourceId)) ? context : new p02(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b2 = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b2 = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b2 = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b2 = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b2 = -1;
                }
                break;
            case -658531749:
                b2 = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b2 = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b2 = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b2 = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b2 = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b2 = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b2 = !str.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b2 = !str.equals("EditText") ? (byte) -1 : (byte) 12;
                break;
            case 2001146706:
                b2 = !str.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                c00Var = new c00(p02Var, attributeSet);
                break;
            case 1:
                c00Var = new zy(p02Var, attributeSet);
                break;
            case 2:
                c00Var = new yz(p02Var, attributeSet);
                break;
            case 3:
                c00Var = p00Var.e(p02Var, attributeSet);
                break;
            case 4:
                c00Var = new AppCompatImageButton(p02Var, attributeSet);
                break;
            case 5:
                c00Var = new f00(p02Var, attributeSet);
                break;
            case 6:
                c00Var = new i00(p02Var, attributeSet, com.hwpo_training_app.R.attr.spinnerStyle);
                break;
            case 7:
                c00Var = p00Var.d(p02Var, attributeSet);
                break;
            case 8:
                c00Var = new o00(p02Var, attributeSet);
                break;
            case 9:
                c00Var = new AppCompatImageView(p02Var, attributeSet);
                break;
            case 10:
                c00Var = p00Var.a(p02Var, attributeSet);
                break;
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                c00Var = p00Var.c(p02Var, attributeSet);
                break;
            case 12:
                c00Var = new AppCompatEditText(p02Var, attributeSet);
                break;
            case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                c00Var = p00Var.b(p02Var, attributeSet);
                break;
            default:
                c00Var = null;
                break;
        }
        if (c00Var == null && context != p02Var) {
            Object[] objArr = p00Var.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = p02Var;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr = p00.g;
                        if (i3 < 3) {
                            View viewF = p00Var.f(p02Var, str, strArr[i3]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewF;
                            } else {
                                i3++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewF2 = p00Var.f(p02Var, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewF2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            c00Var = view2;
        }
        if (c00Var != null) {
            Context context3 = c00Var.getContext();
            if ((context3 instanceof ContextWrapper) && c00Var.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, p00.c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c00Var.setOnClickListener(new p00.a(c00Var, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = p02Var.obtainStyledAttributes(attributeSet, p00.d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap<View, fib> weakHashMap = egb.a;
                    new dgb(com.hwpo_training_app.R.id.tag_accessibility_heading, Boolean.class, 0, 28).c(c00Var, Boolean.valueOf(z));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = p02Var.obtainStyledAttributes(attributeSet, p00.e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    egb.p(c00Var, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = p02Var.obtainStyledAttributes(attributeSet, p00.f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap<View, fib> weakHashMap2 = egb.a;
                    new agb(com.hwpo_training_app.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28).c(c00Var, Boolean.valueOf(z2));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return c00Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // defpackage.dz
    public final void p() {
        if (this.C instanceof Activity) {
            synchronized (dz.A) {
                dz.u(this);
            }
        }
        if (this.s0) {
            this.E.getDecorView().removeCallbacks(this.u0);
        }
        this.k0 = true;
        if (this.m0 != -100) {
            Object obj = this.C;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                B0.put(this.C.getClass().getName(), Integer.valueOf(this.m0));
            } else {
                B0.remove(this.C.getClass().getName());
            }
        } else {
            B0.remove(this.C.getClass().getName());
        }
        q8 q8Var = this.H;
        if (q8Var != null) {
            q8Var.h();
        }
        m mVar = this.q0;
        if (mVar != null) {
            mVar.a();
        }
        k kVar = this.r0;
        if (kVar != null) {
            kVar.a();
        }
    }

    @Override // defpackage.dz
    public final void q() {
        M();
    }

    @Override // defpackage.dz
    public final void r() {
        Q();
        q8 q8Var = this.H;
        if (q8Var != null) {
            q8Var.n(true);
        }
    }

    @Override // defpackage.dz
    public final void s() throws IllegalAccessException {
        D(true, false);
    }

    @Override // defpackage.dz
    public final void t() {
        Q();
        q8 q8Var = this.H;
        if (q8Var != null) {
            q8Var.n(false);
        }
    }

    @Override // defpackage.dz
    public final boolean v(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.d0 && i2 == 108) {
            return false;
        }
        if (this.Z && i2 == 1) {
            this.Z = false;
        }
        if (i2 == 1) {
            X();
            this.d0 = true;
            return true;
        }
        if (i2 == 2) {
            X();
            this.X = true;
            return true;
        }
        if (i2 == 5) {
            X();
            this.Y = true;
            return true;
        }
        if (i2 == 10) {
            X();
            this.b0 = true;
            return true;
        }
        if (i2 == 108) {
            X();
            this.Z = true;
            return true;
        }
        if (i2 != 109) {
            return this.E.requestFeature(i2);
        }
        X();
        this.a0 = true;
        return true;
    }

    @Override // defpackage.dz
    public final void w(int i2) {
        M();
        ViewGroup viewGroup = (ViewGroup) this.U.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.D).inflate(i2, viewGroup);
        this.F.a(this.E.getCallback());
    }

    @Override // defpackage.dz
    public final void x(View view) {
        M();
        ViewGroup viewGroup = (ViewGroup) this.U.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.F.a(this.E.getCallback());
    }

    @Override // defpackage.dz
    public final void y(View view, ViewGroup.LayoutParams layoutParams) {
        M();
        ViewGroup viewGroup = (ViewGroup) this.U.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.F.a(this.E.getCallback());
    }

    @Override // defpackage.dz
    public final void z(Toolbar toolbar) {
        Object obj = this.C;
        if (obj instanceof Activity) {
            Q();
            q8 q8Var = this.H;
            if (q8Var instanceof lmb) {
                aa0.c("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                return;
            }
            this.I = null;
            if (q8Var != null) {
                q8Var.h();
            }
            this.H = null;
            if (toolbar != null) {
                kqa kqaVar = new kqa(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.J, this.F);
                this.H = kqaVar;
                this.F.u = kqaVar.c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.F.u = null;
            }
            l();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class j extends imb {
        public c u;
        public boolean v;
        public boolean w;
        public boolean x;

        public j(Window.Callback callback) {
            super(callback);
        }

        public final void a(Window.Callback callback) {
            try {
                this.v = true;
                callback.onContentChanged();
            } finally {
                this.v = false;
            }
        }

        @Override // android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            boolean z = this.w;
            Window.Callback callback = this.t;
            if (z) {
                return callback.dispatchKeyEvent(keyEvent);
            }
            return gz.this.K(keyEvent) || callback.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.Window.Callback
        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (!this.t.dispatchKeyShortcutEvent(keyEvent)) {
                int keyCode = keyEvent.getKeyCode();
                gz gzVar = gz.this;
                gzVar.Q();
                q8 q8Var = gzVar.H;
                if (q8Var == null || !q8Var.i(keyCode, keyEvent)) {
                    o oVar = gzVar.g0;
                    if (oVar == null || !gzVar.V(oVar, keyEvent.getKeyCode(), keyEvent)) {
                        if (gzVar.g0 == null) {
                            o oVarP = gzVar.P(0);
                            gzVar.W(oVarP, keyEvent);
                            boolean zV = gzVar.V(oVarP, keyEvent.getKeyCode(), keyEvent);
                            oVarP.k = false;
                            if (zV) {
                            }
                        }
                        return false;
                    }
                    o oVar2 = gzVar.g0;
                    if (oVar2 != null) {
                        oVar2.l = true;
                        return true;
                    }
                }
            }
            return true;
        }

        @Override // android.view.Window.Callback
        public final void onContentChanged() {
            if (this.v) {
                this.t.onContentChanged();
            }
        }

        @Override // android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.f)) {
                return this.t.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public final View onCreatePanelView(int i) {
            c cVar = this.u;
            if (cVar != null) {
                View view = i == 0 ? new View(kqa.this.a.a.getContext()) : null;
                if (view != null) {
                    return view;
                }
            }
            return this.t.onCreatePanelView(i);
        }

        @Override // defpackage.imb, android.view.Window.Callback
        public final boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            if (i == 108) {
                gz gzVar = gz.this;
                gzVar.Q();
                q8 q8Var = gzVar.H;
                if (q8Var != null) {
                    q8Var.c(true);
                }
            }
            return true;
        }

        @Override // defpackage.imb, android.view.Window.Callback
        public final void onPanelClosed(int i, Menu menu) {
            if (this.x) {
                this.t.onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            gz gzVar = gz.this;
            if (i == 108) {
                gzVar.Q();
                q8 q8Var = gzVar.H;
                if (q8Var != null) {
                    q8Var.c(false);
                    return;
                }
                return;
            }
            if (i == 0) {
                o oVarP = gzVar.P(i);
                if (oVarP.m) {
                    gzVar.I(oVarP, false);
                }
            }
        }

        @Override // android.view.Window.Callback
        public final boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.f fVar = menu instanceof androidx.appcompat.view.menu.f ? (androidx.appcompat.view.menu.f) menu : null;
            if (i == 0 && fVar == null) {
                return false;
            }
            if (fVar != null) {
                fVar.x = true;
            }
            c cVar = this.u;
            if (cVar != null) {
                kqa.e eVar = (kqa.e) cVar;
                if (i == 0) {
                    kqa kqaVar = kqa.this;
                    if (!kqaVar.d) {
                        kqaVar.a.l = true;
                        kqaVar.d = true;
                    }
                }
            }
            boolean zOnPreparePanel = this.t.onPreparePanel(i, view, menu);
            if (fVar != null) {
                fVar.x = false;
            }
            return zOnPreparePanel;
        }

        @Override // defpackage.imb, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.f fVar = gz.this.P(0).h;
            if (fVar != null) {
                super.onProvideKeyboardShortcuts(list, fVar, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        @Override // android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            gz gzVar = gz.this;
            if (!gzVar.S || i != 0) {
                return imb.a.b(this.t, callback, i);
            }
            o5a.a aVar = new o5a.a(gzVar.D, callback);
            u8 u8VarC = gzVar.C(aVar);
            if (u8VarC != null) {
                return aVar.e(u8VarC);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
