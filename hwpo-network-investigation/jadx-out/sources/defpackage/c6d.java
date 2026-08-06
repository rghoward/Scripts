package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c6d {
    public final w5d a;
    public final AtomicLong b = new AtomicLong(-9223372034707292160L);
    public final AtomicReference c = new AtomicReference(null);
    public final AtomicReference d = new AtomicReference(null);
    public final id9 e;
    public final mk9 f;

    public c6d(w40 w40Var) {
        y03 y03Var = y03.t;
        this.e = new id9(y03Var);
        mk9 mk9Var = new mk9();
        this.f = mk9Var;
        w5d w5dVar = new w5d();
        w5dVar.t = w40Var;
        w5dVar.u = y03Var;
        this.a = w5dVar;
        mk9Var.Q(w5dVar, y03Var);
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
    public final b1 a() {
        AtomicLong atomicLong;
        long j;
        final int i;
        Object objH1;
        y03 y03Var = y03.t;
        mk9 mk9Var = this.f;
        if (mk9Var.isDone()) {
            return mk9Var;
        }
        do {
            atomicLong = this.b;
            j = atomicLong.get();
            i = (int) (j >>> 32);
        } while (!atomicLong.compareAndSet(j, (((long) (((int) j) + 1)) & 4294967295L) | (((long) i) << 32)));
        AtomicReference atomicReference = this.d;
        final mk9 mk9Var2 = new mk9();
        ListenableFuture listenableFuture = (ListenableFuture) atomicReference.getAndSet(mk9Var2);
        if (listenableFuture == null) {
            l7d l7dVarA = v7d.a(new w40() { // from class: y5d
                @Override // defpackage.w40
                public final /* synthetic */ ListenableFuture call() {
                    return this.a.b(i);
                }
            });
            kya kyaVar = new kya();
            kyaVar.B = new kya.a(l7dVarA);
            y03Var.execute(kyaVar);
            objH1 = kyaVar;
        } else {
            x40 x40Var = new x40() { // from class: x5d
                @Override // defpackage.x40
                public final /* synthetic */ ListenableFuture apply(Object obj) {
                    return this.a.b(i);
                }
            };
            int i2 = v7d.a;
            objH1 = ti4.h1(listenableFuture, Throwable.class, new m7d(m6d.a(), x40Var), this.e);
        }
        mk9Var2.n(objH1);
        final a6d a6dVar = new a6d(this, i);
        mk9Var2.Q(new Runnable() { // from class: z5d
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                mk9 mk9Var3 = mk9Var2;
                a6d a6dVar2 = a6dVar;
                try {
                    Object objI1 = ti4.i1(mk9Var3);
                    mk9 mk9Var4 = this.t.f;
                    mk9Var4.l(objI1);
                    a6dVar2.n(mk9Var4);
                } catch (Throwable unused) {
                    a6dVar2.n(mk9Var3);
                }
            }
        }, y03Var);
        return a6dVar;
    }

    public final b1 b(int i) {
        y03 y03Var;
        AtomicLong atomicLong = this.b;
        if (((int) (atomicLong.get() >>> 32)) > i) {
            t85.a<Object> aVar = t85.a.A;
            return aVar != null ? aVar : new t85.a();
        }
        b6d b6dVar = new b6d(i);
        while (true) {
            AtomicReference atomicReference = this.c;
            b6d b6dVar2 = (b6d) atomicReference.get();
            if (b6dVar2 != null && b6dVar2.A > i) {
                t85.a<Object> aVar2 = t85.a.A;
                return aVar2 != null ? aVar2 : new t85.a();
            }
            do {
                if (atomicReference.compareAndSet(b6dVar2, b6dVar)) {
                    if (((int) (atomicLong.get() >>> 32)) > i) {
                        b6dVar.cancel(true);
                        while (!atomicReference.compareAndSet(b6dVar, null) && atomicReference.get() == b6dVar) {
                        }
                        return b6dVar;
                    }
                    w5d w5dVar = this.a;
                    w40 w40Var = w5dVar.t;
                    if (w40Var == null || (y03Var = w5dVar.u) == null) {
                        b6dVar.n(this.f);
                        return b6dVar;
                    }
                    l7d l7dVarA = v7d.a(w40Var);
                    kya kyaVar = new kya();
                    kyaVar.B = new kya.a(l7dVarA);
                    y03Var.execute(kyaVar);
                    b6dVar.n(kyaVar);
                    return b6dVar;
                }
            } while (atomicReference.get() == b6dVar2);
        }
    }
}
