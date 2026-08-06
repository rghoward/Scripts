package defpackage;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ik0<T extends IInterface> {
    public static final fu3[] R = new fu3[0];
    public yxb B;
    public c C;
    public IInterface D;
    public kdc F;
    public final a H;
    public final b I;
    public final int J;
    public final String K;
    public volatile String L;
    public volatile p70 M;
    public q2d u;
    public final Context v;
    public final ln4 w;
    public final xn4 x;
    public final e9c y;
    public volatile String t = null;
    public final Object z = new Object();
    public final Object A = new Object();
    public final ArrayList E = new ArrayList();
    public int G = 1;
    public ax1 N = null;
    public boolean O = false;
    public volatile mmc P = null;
    public final AtomicInteger Q = new AtomicInteger(0);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        void g(int i);

        void i();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
        void a(ax1 ax1Var);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface c {
        void a(ax1 ax1Var);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class d implements c {
        public final /* synthetic */ ik0 a;

        public d(ik0 ik0Var) {
            Objects.requireNonNull(ik0Var);
            this.a = ik0Var;
        }

        @Override // ik0.c
        public final void a(ax1 ax1Var) {
            boolean z = ax1Var.u == 0;
            ik0 ik0Var = this.a;
            if (z) {
                ik0Var.p(null, ik0Var.w());
                return;
            }
            b bVar = ik0Var.I;
            if (bVar != null) {
                bVar.a(ax1Var);
            }
        }
    }

    public ik0(Context context, Looper looper, j0d j0dVar, xn4 xn4Var, int i, a aVar, b bVar, String str) {
        a78.h(context, "Context must not be null");
        this.v = context;
        a78.h(looper, "Looper must not be null");
        a78.h(j0dVar, "Supervisor must not be null");
        this.w = j0dVar;
        a78.h(xn4Var, "API availability must not be null");
        this.x = xn4Var;
        this.y = new e9c(this, looper);
        this.J = i;
        this.H = aVar;
        this.I = bVar;
        this.K = str;
    }

    public boolean A() {
        return l() >= 211700000;
    }

    public final /* synthetic */ boolean B(int i, int i2, IInterface iInterface) {
        synchronized (this.z) {
            try {
                if (this.G != i) {
                    return false;
                }
                C(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void C(int i, IInterface iInterface) {
        q2d q2dVar;
        a78.b((i == 4) == (iInterface != null));
        synchronized (this.z) {
            try {
                this.G = i;
                this.D = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    kdc kdcVar = this.F;
                    if (kdcVar != null) {
                        ln4 ln4Var = this.w;
                        String str = this.u.a;
                        a78.g(str);
                        this.u.getClass();
                        if (this.K == null) {
                            this.v.getClass();
                        }
                        boolean z = this.u.b;
                        ln4Var.getClass();
                        ln4Var.f1(new suc(str, z), kdcVar);
                        this.F = null;
                    }
                } else if (i == 2 || i == 3) {
                    kdc kdcVar2 = this.F;
                    if (kdcVar2 != null && (q2dVar = this.u) != null) {
                        String str2 = q2dVar.a;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str2);
                        sb.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        ln4 ln4Var2 = this.w;
                        String str3 = this.u.a;
                        a78.g(str3);
                        this.u.getClass();
                        if (this.K == null) {
                            this.v.getClass();
                        }
                        boolean z2 = this.u.b;
                        ln4Var2.getClass();
                        ln4Var2.f1(new suc(str3, z2), kdcVar2);
                        this.Q.incrementAndGet();
                    }
                    kdc kdcVar3 = new kdc(this, this.Q.get());
                    this.F = kdcVar3;
                    String strZ = z();
                    boolean zA = A();
                    this.u = new q2d(strZ, zA);
                    if (zA && l() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.u.a)));
                    }
                    ln4 ln4Var3 = this.w;
                    String str4 = this.u.a;
                    a78.g(str4);
                    this.u.getClass();
                    String name = this.K;
                    if (name == null) {
                        name = this.v.getClass().getName();
                    }
                    ax1 ax1VarC1 = ln4Var3.c1(new suc(str4, this.u.b), kdcVar3, name, u());
                    if (!(ax1VarC1.u == 0)) {
                        String str5 = this.u.a;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str5);
                        sb2.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        int i2 = ax1VarC1.u;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (ax1VarC1.v != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", ax1VarC1.v);
                        }
                        int i3 = this.Q.get();
                        agc agcVar = new agc(this, i2, bundle);
                        e9c e9cVar = this.y;
                        e9cVar.sendMessage(e9cVar.obtainMessage(7, i3, -1, agcVar));
                    }
                } else if (i == 4) {
                    a78.g(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str) {
        this.t = str;
        h();
    }

    public final boolean d() {
        boolean z;
        synchronized (this.z) {
            int i = this.G;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final String e() {
        if (i() && this.u != null) {
            return "com.google.android.gms";
        }
        ru3.d("Failed to connect when checking package");
        return null;
    }

    public final void f(qub qubVar) {
        qubVar.a.m.F.post(new pub(qubVar));
    }

    public final void g(c cVar) {
        this.C = cVar;
        C(2, null);
    }

    public final void h() {
        this.Q.incrementAndGet();
        ArrayList arrayList = this.E;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    uac uacVar = (uac) arrayList.get(i);
                    synchronized (uacVar) {
                        uacVar.a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.A) {
            this.B = null;
        }
        C(1, null);
    }

    public final boolean i() {
        boolean z;
        synchronized (this.z) {
            z = this.G == 4;
        }
        return z;
    }

    public final boolean j() {
        return true;
    }

    public int l() {
        return xn4.a;
    }

    public final fu3[] m() {
        mmc mmcVar = this.P;
        if (mmcVar == null) {
            return null;
        }
        return mmcVar.u;
    }

    public final String n() {
        return this.t;
    }

    public boolean o() {
        return false;
    }

    public final void p(p55 p55Var, Set<Scope> set) {
        AttributionSource attributionSource;
        Bundle bundleV = v();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.M == null || (attributionSource = this.M.a) == null || attributionSource.getAttributionTag() == null) ? this.L : attributionSource.getAttributionTag();
        String str = attributionTag;
        int i = this.J;
        int i2 = xn4.a;
        Scope[] scopeArr = kl4.H;
        Bundle bundle = new Bundle();
        fu3[] fu3VarArr = kl4.I;
        kl4 kl4Var = new kl4(6, i, i2, null, null, scopeArr, bundle, null, fu3VarArr, fu3VarArr, true, 0, false, str);
        kl4Var.w = this.v.getPackageName();
        kl4Var.z = bundleV;
        if (set != null) {
            kl4Var.y = (Scope[]) set.toArray(new Scope[0]);
        }
        if (o()) {
            Account accountS = s();
            if (accountS == null) {
                accountS = new Account("<<default account>>", "com.google");
            }
            kl4Var.A = accountS;
            if (p55Var != null) {
                kl4Var.x = p55Var.asBinder();
            }
        }
        kl4Var.B = R;
        kl4Var.C = t();
        try {
            synchronized (this.A) {
                try {
                    yxb yxbVar = this.B;
                    if (yxbVar != null) {
                        yxbVar.a(new acc(this, this.Q.get()), kl4Var);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i3 = this.Q.get();
            e9c e9cVar = this.y;
            e9cVar.sendMessage(e9cVar.obtainMessage(6, i3, 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i4 = this.Q.get();
            pec pecVar = new pec(this, 8, null, null);
            e9c e9cVar2 = this.y;
            e9cVar2.sendMessage(e9cVar2.obtainMessage(1, i4, -1, pecVar));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i5 = this.Q.get();
            pec pecVar2 = new pec(this, 8, null, null);
            e9c e9cVar3 = this.y;
            e9cVar3.sendMessage(e9cVar3.obtainMessage(1, i5, -1, pecVar2));
        }
    }

    public final void q() {
        int iB = this.x.b(this.v, l());
        if (iB == 0) {
            g(new d(this));
            return;
        }
        C(1, null);
        this.C = new d(this);
        int i = this.Q.get();
        e9c e9cVar = this.y;
        e9cVar.sendMessage(e9cVar.obtainMessage(3, i, iB, null));
    }

    public abstract T r(IBinder iBinder);

    public Account s() {
        return null;
    }

    public fu3[] t() {
        return R;
    }

    public Executor u() {
        return null;
    }

    public Bundle v() {
        return new Bundle();
    }

    public Set<Scope> w() {
        return Collections.EMPTY_SET;
    }

    public final T x() {
        T t;
        synchronized (this.z) {
            try {
                if (this.G == 5) {
                    throw new DeadObjectException();
                }
                if (!i()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                t = (T) this.D;
                a78.h(t, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    public abstract String y();

    public abstract String z();
}
