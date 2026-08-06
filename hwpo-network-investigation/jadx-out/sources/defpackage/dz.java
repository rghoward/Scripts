package defpackage;

import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dz {
    public static final c t = new c(new d());
    public static final int u = -100;
    public static bd6 v = null;
    public static bd6 w = null;
    public static Boolean x = null;
    public static boolean y = false;
    public static final r30<WeakReference<dz>> z = new r30<>(0);
    public static final Object A = new Object();
    public static final Object B = new Object();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c implements Executor {
        public final Object t = new Object();
        public final ArrayDeque u = new ArrayDeque();
        public final d v;
        public Runnable w;

        public c(d dVar) {
            this.v = dVar;
        }

        public final void a() {
            synchronized (this.t) {
                try {
                    Runnable runnable = (Runnable) this.u.poll();
                    this.w = runnable;
                    if (runnable != null) {
                        this.v.execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            synchronized (this.t) {
                try {
                    this.u.add(new ez(0, this, runnable));
                    if (this.w == null) {
                        a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class d implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    public static boolean m(Context context) {
        if (x == null) {
            try {
                int i = w10.t;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) w10.class), w10.a.a() | 128).metaData;
                if (bundle != null) {
                    x = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                x = Boolean.FALSE;
            }
        }
        return x.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void u(dz dzVar) {
        synchronized (A) {
            try {
                r30<WeakReference<dz>> r30Var = z;
                r30Var.getClass();
                r30.a aVar = new r30.a();
                while (aVar.hasNext()) {
                    dz dzVar2 = (dz) ((WeakReference) aVar.next()).get();
                    if (dzVar2 == dzVar || dzVar2 == null) {
                        aVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void B(CharSequence charSequence);

    public abstract u8 C(u8.a aVar);

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public abstract <T extends View> T e(int i);

    public Context f() {
        return null;
    }

    public abstract gz.b g();

    public int h() {
        return -100;
    }

    public abstract MenuInflater i();

    public abstract q8 j();

    public abstract void k();

    public abstract void l();

    public abstract void n(Configuration configuration);

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract void s();

    public abstract void t();

    public abstract boolean v(int i);

    public abstract void w(int i);

    public abstract void x(View view);

    public abstract void y(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void z(Toolbar toolbar);

    public void A(int i) {
    }

    public Context d(Context context) {
        return context;
    }
}
