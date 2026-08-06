package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hc6 {
    public static final Object f = new Object();
    public static hc6 g;
    public final Context a;
    public final HashMap<BroadcastReceiver, ArrayList<c>> b = new HashMap<>();
    public final HashMap<String, ArrayList<c>> c = new HashMap<>();
    public final ArrayList<b> d = new ArrayList<>();
    public final a e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int size;
            b[] bVarArr;
            if (message.what != 1) {
                super.handleMessage(message);
                return;
            }
            hc6 hc6Var = hc6.this;
            while (true) {
                synchronized (hc6Var.b) {
                    try {
                        size = hc6Var.d.size();
                        if (size <= 0) {
                            return;
                        }
                        bVarArr = new b[size];
                        hc6Var.d.toArray(bVarArr);
                        hc6Var.d.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                for (int i = 0; i < size; i++) {
                    b bVar = bVarArr[i];
                    int size2 = bVar.b.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        c cVar = bVar.b.get(i2);
                        if (!cVar.d) {
                            cVar.b.onReceive(hc6Var.a, bVar.a);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final Intent a;
        public final ArrayList<c> b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.a = intent;
            this.b = arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class c {
        public final IntentFilter a;
        public final BroadcastReceiver b;
        public boolean c;
        public boolean d;

        public c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.a = intentFilter;
            this.b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.b);
            sb.append(" filter=");
            sb.append(this.a);
            if (this.d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public hc6(Context context) {
        this.a = context;
        this.e = new a(context.getMainLooper());
    }

    public static hc6 a(Context context) {
        hc6 hc6Var;
        synchronized (f) {
            try {
                if (g == null) {
                    g = new hc6(context.getApplicationContext());
                }
                hc6Var = g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hc6Var;
    }
}
