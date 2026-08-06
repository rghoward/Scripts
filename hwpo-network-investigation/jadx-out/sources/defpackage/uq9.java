package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uq9 {
    public static volatile uq9 d;
    public final c a;
    public final HashSet b = new HashSet();
    public boolean c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements vm4<ConnectivityManager> {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // defpackage.vm4
        public final ConnectivityManager get() {
            return (ConnectivityManager) this.a.getSystemService("connectivity");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b implements gx1.a {
        public b() {
        }

        @Override // gx1.a
        public final void a(boolean z) {
            ArrayList arrayList;
            l6b.a();
            synchronized (uq9.this) {
                arrayList = new ArrayList(uq9.this.b);
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((gx1.a) obj).a(z);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c {
        public boolean a;
        public final b b;
        public final um4 c;
        public final a d = new a();

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a extends ConnectivityManager.NetworkCallback {
            public a() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                l6b.f().post(new vq9(this, true));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                l6b.f().post(new vq9(this, false));
            }
        }

        public c(um4 um4Var, b bVar) {
            this.c = um4Var;
            this.b = bVar;
        }
    }

    public uq9(Context context) {
        this.a = new c(new um4(new a(context)), new b());
    }

    public static uq9 a(Context context) {
        if (d == null) {
            synchronized (uq9.class) {
                try {
                    if (d == null) {
                        d = new uq9(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public final void b() {
        if (this.c || this.b.isEmpty()) {
            return;
        }
        c cVar = this.a;
        um4 um4Var = cVar.c;
        boolean z = false;
        cVar.a = ((ConnectivityManager) um4Var.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) um4Var.get()).registerDefaultNetworkCallback(cVar.d);
            z = true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e);
            }
        }
        this.c = z;
    }
}
