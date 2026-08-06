package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rub implements yn4.a, yn4.b {
    public final zw.e c;
    public final ux d;
    public final cub e;
    public final int h;
    public final lvb i;
    public boolean j;
    public final /* synthetic */ zn4 m;
    public final LinkedList b = new LinkedList();
    public final HashSet f = new HashSet();
    public final HashMap g = new HashMap();
    public final ArrayList k = new ArrayList();
    public ax1 l = null;

    /* JADX WARN: Multi-variable type inference failed */
    public rub(zn4 zn4Var, vn4 vn4Var) {
        String str;
        this.m = zn4Var;
        Looper looper = zn4Var.F.getLooper();
        nf1.a aVarA = vn4Var.a();
        nf1 nf1Var = new nf1(aVarA.a, aVarA.b, aVarA.c, aVarA.d);
        zw.a aVar = vn4Var.d.a;
        a78.g(aVar);
        zw.e eVarA = aVar.a(vn4Var.a, looper, nf1Var, vn4Var.e, this, this);
        p70 p70Var = vn4Var.c;
        if (p70Var != null && (eVarA instanceof ik0)) {
            ((ik0) eVarA).M = p70Var;
        } else if ((p70Var == null || !(eVarA instanceof ac7)) && (str = vn4Var.b) != null && (eVarA instanceof ik0)) {
            ((ik0) eVarA).L = str;
        }
        this.c = eVarA;
        this.d = vn4Var.f;
        this.e = new cub();
        this.h = vn4Var.h;
        if (!eVarA.o()) {
            this.i = null;
            return;
        }
        Context context = zn4Var.x;
        rwb rwbVar = zn4Var.F;
        nf1.a aVarA2 = vn4Var.a();
        this.i = new lvb(context, rwbVar, new nf1(aVarA2.a, aVarA2.b, aVarA2.c, aVarA2.d));
    }

    @Override // defpackage.hh7
    public final void a(ax1 ax1Var) {
        p(ax1Var, null);
    }

    public final void b() {
        zw.e eVar = this.c;
        zn4 zn4Var = this.m;
        a78.c(zn4Var.F);
        this.l = null;
        m(ax1.y);
        if (this.j) {
            rwb rwbVar = zn4Var.F;
            ux uxVar = this.d;
            rwbVar.removeMessages(11, uxVar);
            zn4Var.F.removeMessages(9, uxVar);
            this.j = false;
        }
        Iterator it = this.g.values().iterator();
        while (it.hasNext()) {
            gvb gvbVar = ((fvb) it.next()).a;
            if (n(gvbVar.b) != null) {
                it.remove();
            } else {
                try {
                    gvbVar.d.a.accept(eVar, new t9a());
                } catch (DeadObjectException unused) {
                    g(3);
                    eVar.c("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e) {
                    e = e;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                } catch (RuntimeException e2) {
                    e = e2;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        e();
        k();
    }

    public final void c(int i) {
        a78.c(this.m.F);
        this.l = null;
        this.j = true;
        String strN = this.c.n();
        cub cubVar = this.e;
        cubVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strN != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strN);
        }
        cubVar.a(true, new Status(20, sb.toString(), null, null));
        ux uxVar = this.d;
        zn4 zn4Var = this.m;
        rwb rwbVar = zn4Var.F;
        rwbVar.sendMessageDelayed(Message.obtain(rwbVar, 9, uxVar), 5000L);
        rwb rwbVar2 = zn4Var.F;
        rwbVar2.sendMessageDelayed(Message.obtain(rwbVar2, 11, uxVar), 120000L);
        SparseIntArray sparseIntArray = zn4Var.z.a;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.g.values().iterator();
        while (it.hasNext()) {
            ((fvb) it.next()).getClass();
        }
    }

    public final boolean d(ax1 ax1Var) {
        synchronized (zn4.J) {
            this.m.getClass();
        }
        return false;
    }

    public final void e() {
        LinkedList linkedList = this.b;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ewb ewbVar = (ewb) arrayList.get(i);
            if (!this.c.i()) {
                return;
            }
            if (f(ewbVar)) {
                linkedList.remove(ewbVar);
            }
        }
    }

    public final boolean f(ewb ewbVar) {
        if (!(ewbVar instanceof dvb)) {
            cub cubVar = this.e;
            zw.e eVar = this.c;
            ewbVar.c(cubVar, eVar.o());
            try {
                ewbVar.d(this);
                return true;
            } catch (DeadObjectException unused) {
                g(1);
                eVar.c("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        dvb dvbVar = (dvb) ewbVar;
        fu3 fu3VarN = n(dvbVar.f(this));
        if (fu3VarN == null) {
            cub cubVar2 = this.e;
            zw.e eVar2 = this.c;
            ewbVar.c(cubVar2, eVar2.o());
            try {
                ewbVar.d(this);
                return true;
            } catch (DeadObjectException unused2) {
                g(1);
                eVar2.c("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.c.getClass().getName();
        String str = fu3VarN.t;
        long j = fu3VarN.j();
        int length = name.length();
        StringBuilder sb = new StringBuilder(length + 53 + String.valueOf(str).length() + 2 + String.valueOf(j).length() + 2);
        ux1.b(sb, name, " could not execute call because it requires feature (", str, ", ");
        sb.append(j);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        zn4 zn4Var = this.m;
        if (!zn4Var.G || !dvbVar.g(this)) {
            dvbVar.b(new m3b(fu3VarN));
            return true;
        }
        int iH = dvbVar.h(this);
        sub subVar = new sub(this.d, fu3VarN);
        ArrayList arrayList = this.k;
        int iIndexOf = arrayList.indexOf(subVar);
        if (iIndexOf >= 0) {
            sub subVar2 = (sub) arrayList.get(iIndexOf);
            zn4Var.F.removeMessages(15, subVar2);
            zn4Var.F.sendMessageDelayed(Message.obtain(zn4Var.F, 15, subVar2), 5000L);
            return false;
        }
        arrayList.add(subVar);
        zn4Var.F.sendMessageDelayed(Message.obtain(zn4Var.F, 15, subVar), 5000L);
        zn4Var.F.sendMessageDelayed(Message.obtain(zn4Var.F, 16, subVar), 120000L);
        ax1 ax1Var = new ax1(1, 2, null, null, Integer.valueOf(iH));
        if (d(ax1Var)) {
            String str2 = fu3VarN.t;
            long j2 = fu3VarN.j();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(j2).length());
            sb2.append("A dialog should be displayed for missing feature: ");
            sb2.append(str2);
            sb2.append(", version: ");
            sb2.append(j2);
            Log.w("GoogleApiManager", sb2.toString());
            return false;
        }
        if (!zn4Var.e(ax1Var, this.h)) {
            return false;
        }
        String str3 = fu3VarN.t;
        long j3 = fu3VarN.j();
        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(j3).length());
        sb3.append("Notification displayed for missing feature: ");
        sb3.append(str3);
        sb3.append(", version: ");
        sb3.append(j3);
        Log.w("GoogleApiManager", sb3.toString());
        return false;
    }

    @Override // defpackage.xw1
    public final void g(int i) {
        zn4 zn4Var = this.m;
        if (Looper.myLooper() == zn4Var.F.getLooper()) {
            c(i);
        } else {
            zn4Var.F.post(new oub(this, i));
        }
    }

    public final void h(Status status, Exception exc, boolean z) {
        a78.c(this.m.F);
        if ((status == null) == (exc == null)) {
            z90.a("Status XOR exception should be null");
            return;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ewb ewbVar = (ewb) it.next();
            if (!z || ewbVar.a == 2) {
                if (status != null) {
                    ewbVar.a(status);
                } else {
                    ewbVar.b(exc);
                }
                it.remove();
            }
        }
    }

    @Override // defpackage.xw1
    public final void i() {
        zn4 zn4Var = this.m;
        if (Looper.myLooper() == zn4Var.F.getLooper()) {
            b();
        } else {
            zn4Var.F.post(new zf4(1, this));
        }
    }

    public final void j(Status status) {
        a78.c(this.m.F);
        h(status, null, false);
    }

    public final void k() {
        zn4 zn4Var = this.m;
        rwb rwbVar = zn4Var.F;
        ux uxVar = this.d;
        rwbVar.removeMessages(12, uxVar);
        rwb rwbVar2 = zn4Var.F;
        rwbVar2.sendMessageDelayed(rwbVar2.obtainMessage(12, uxVar), zn4Var.t);
    }

    public final boolean l(boolean z) {
        a78.c(this.m.F);
        zw.e eVar = this.c;
        if (!eVar.i() || !this.g.isEmpty()) {
            return false;
        }
        cub cubVar = this.e;
        if (cubVar.a.isEmpty() && cubVar.b.isEmpty()) {
            eVar.c("Timing out service connection.");
            return true;
        }
        if (!z) {
            return false;
        }
        k();
        return false;
    }

    public final void m(ax1 ax1Var) {
        HashSet hashSet = this.f;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        owb owbVar = (owb) it.next();
        if (te7.a(ax1Var, ax1.y)) {
            this.c.e();
        }
        owbVar.getClass();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fu3 n(fu3[] fu3VarArr) {
        if (fu3VarArr == null || fu3VarArr.length == 0) {
            return null;
        }
        fu3[] fu3VarArrM = this.c.m();
        if (fu3VarArrM == null) {
            fu3VarArrM = new fu3[0];
        }
        n30 n30Var = new n30(fu3VarArrM.length);
        for (fu3 fu3Var : fu3VarArrM) {
            n30Var.put(fu3Var.t, Long.valueOf(fu3Var.j()));
        }
        for (fu3 fu3Var2 : fu3VarArr) {
            Long l = (Long) n30Var.get(fu3Var2.t);
            if (l == null || l.longValue() < fu3Var2.j()) {
                return fu3Var2;
            }
        }
        return null;
    }

    public final void o(ax1 ax1Var) {
        a78.c(this.m.F);
        zw.e eVar = this.c;
        String name = eVar.getClass().getName();
        String strValueOf = String.valueOf(ax1Var);
        eVar.c(ao2.a(new StringBuilder(name.length() + 25 + strValueOf.length()), "onSignInFailed for ", name, " with ", strValueOf));
        p(ax1Var, null);
    }

    public final void p(ax1 ax1Var, RuntimeException runtimeException) {
        svb svbVar;
        zn4 zn4Var = this.m;
        a78.c(zn4Var.F);
        lvb lvbVar = this.i;
        if (lvbVar != null && (svbVar = lvbVar.g) != null) {
            svbVar.h();
        }
        a78.c(this.m.F);
        this.l = null;
        SparseIntArray sparseIntArray = zn4Var.z.a;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        m(ax1Var);
        if ((this.c instanceof axb) && ax1Var.u != 24) {
            zn4Var.u = true;
            rwb rwbVar = zn4Var.F;
            rwbVar.sendMessageDelayed(rwbVar.obtainMessage(19), AudioConstants.MAX_RECORDING_DURATION_MS);
        }
        int i = ax1Var.u;
        if (i == 4) {
            j(zn4.I);
            return;
        }
        if (i == 25) {
            j(zn4.b(this.d, ax1Var));
            return;
        }
        LinkedList linkedList = this.b;
        if (linkedList.isEmpty()) {
            this.l = ax1Var;
            return;
        }
        if (runtimeException != null) {
            a78.c(zn4Var.F);
            h(null, runtimeException, false);
            return;
        }
        boolean z = zn4Var.G;
        ux uxVar = this.d;
        if (!z) {
            j(zn4.b(uxVar, ax1Var));
            return;
        }
        h(zn4.b(uxVar, ax1Var), null, true);
        if (linkedList.isEmpty() || d(ax1Var) || zn4Var.e(ax1Var, this.h)) {
            return;
        }
        if (ax1Var.u == 18) {
            this.j = true;
        }
        if (!this.j) {
            j(zn4.b(uxVar, ax1Var));
        } else {
            rwb rwbVar2 = zn4Var.F;
            rwbVar2.sendMessageDelayed(Message.obtain(rwbVar2, 9, uxVar), 5000L);
        }
    }

    public final void q(dvb dvbVar) {
        a78.c(this.m.F);
        boolean zI = this.c.i();
        LinkedList linkedList = this.b;
        if (zI) {
            if (f(dvbVar)) {
                k();
                return;
            } else {
                linkedList.add(dvbVar);
                return;
            }
        }
        linkedList.add(dvbVar);
        ax1 ax1Var = this.l;
        if (ax1Var == null || ax1Var.u == 0 || ax1Var.v == null) {
            s();
        } else {
            p(ax1Var, null);
        }
    }

    public final void r() {
        a78.c(this.m.F);
        Status status = zn4.H;
        j(status);
        cub cubVar = this.e;
        cubVar.getClass();
        cubVar.a(false, status);
        for (db6.a aVar : (db6.a[]) this.g.keySet().toArray(new db6.a[0])) {
            q(new bwb(aVar, new t9a()));
        }
        m(new ax1(4, null, null));
        zw.e eVar = this.c;
        if (eVar.i()) {
            eVar.f(new qub(this));
        }
    }

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
    public final void s() {
        zn4 zn4Var = this.m;
        a78.c(zn4Var.F);
        zw.e eVar = this.c;
        if (eVar.i() || eVar.d()) {
            return;
        }
        try {
            int iA = zn4Var.z.a(zn4Var.x, eVar);
            if (iA != 0) {
                ax1 ax1Var = new ax1(iA, null, null);
                String name = eVar.getClass().getName();
                String string = ax1Var.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + string.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(string);
                Log.w("GoogleApiManager", sb.toString());
                p(ax1Var, null);
                return;
            }
            uub uubVar = new uub(zn4Var, eVar, this.d);
            if (eVar.o()) {
                lvb lvbVar = this.i;
                a78.g(lvbVar);
                svb svbVar = lvbVar.g;
                if (svbVar != null) {
                    svbVar.h();
                }
                nf1 nf1Var = lvbVar.f;
                nf1Var.h = Integer.valueOf(System.identityHashCode(lvbVar));
                ztb ztbVar = lvbVar.d;
                Context context = lvbVar.b;
                Handler handler = lvbVar.c;
                lvbVar.g = (svb) ztbVar.a(context, handler.getLooper(), nf1Var, nf1Var.g, lvbVar, lvbVar);
                lvbVar.h = uubVar;
                Set set = lvbVar.e;
                if (set == null || set.isEmpty()) {
                    handler.post(new jvb(lvbVar));
                } else {
                    lvbVar.g.k();
                }
            }
            try {
                eVar.g(uubVar);
            } catch (SecurityException e) {
                p(new ax1(10, null, null), e);
            }
        } catch (IllegalStateException e2) {
            p(new ax1(10, null, null), e2);
        }
    }
}
