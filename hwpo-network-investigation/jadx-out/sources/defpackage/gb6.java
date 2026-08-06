package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gb6<T> {
    public final vf1 a;
    public final Thread b;
    public final kt4 c;
    public final b<T> d;
    public final CopyOnWriteArraySet<c<T>> e;
    public final ArrayDeque<Runnable> f;
    public final ArrayDeque<Runnable> g;
    public final Object h;
    public boolean i;
    public final boolean j;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a<T> {
        void invoke(T t);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b<T> {
        void a(T t, y34 y34Var);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c<T> {
        public final T a;
        public y34.a b = new y34.a();
        public boolean c;
        public boolean d;

        public c(T t) {
            this.a = t;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public gb6(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, Thread thread, vf1 vf1Var, b<T> bVar, boolean z) {
        this.a = vf1Var;
        this.b = thread;
        this.e = copyOnWriteArraySet;
        this.d = bVar;
        this.h = new Object();
        this.f = new ArrayDeque<>();
        this.g = new ArrayDeque<>();
        if (looper == null || vf1Var == null || bVar == null) {
            this.c = null;
        } else {
            this.c = vf1Var.b(looper, new Handler.Callback() { // from class: eb6
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
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    gb6 gb6Var = this.t;
                    gb6.b<T> bVar2 = gb6Var.d;
                    bVar2.getClass();
                    Iterator it = gb6Var.e.iterator();
                    while (it.hasNext()) {
                        gb6.c cVar = (gb6.c) it.next();
                        if (!cVar.d && cVar.c) {
                            y34 y34VarB = cVar.b.b();
                            cVar.b = new y34.a();
                            cVar.c = false;
                            bVar2.a(cVar.a, y34VarB);
                        }
                        kt4 kt4Var = gb6Var.c;
                        kt4Var.getClass();
                        if (kt4Var.i(1)) {
                            break;
                        }
                    }
                    return true;
                }
            });
        }
        this.j = z;
    }

    public final void a(T t) {
        t.getClass();
        synchronized (this.h) {
            try {
                if (this.i) {
                    return;
                }
                this.e.add(new c<>(t));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        if (this.j) {
            xl7.r(Thread.currentThread() == this.b);
        }
        ArrayDeque<Runnable> arrayDeque = this.g;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (this.d != null) {
            kt4 kt4Var = this.c;
            kt4Var.getClass();
            if (!kt4Var.i(1)) {
                kt4Var.b(kt4Var.f(1));
            }
        }
        ArrayDeque<Runnable> arrayDeque2 = this.f;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                arrayDeque2.peekFirst().run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(final int i, final a<T> aVar) {
        if (this.j) {
            xl7.r(Thread.currentThread() == this.b);
        }
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.e);
        this.g.add(new Runnable() { // from class: fb6
            @Override // java.lang.Runnable
            public final void run() {
                for (gb6.c cVar : copyOnWriteArraySet) {
                    if (!cVar.d) {
                        int i2 = i;
                        if (i2 != -1) {
                            cVar.b.a(i2);
                        }
                        cVar.c = true;
                        aVar.invoke(cVar.a);
                    }
                }
            }
        });
    }

    public final void d() {
        if (this.j) {
            xl7.r(Thread.currentThread() == this.b);
        }
        synchronized (this.h) {
            this.i = true;
        }
        for (c<T> cVar : this.e) {
            b<T> bVar = this.d;
            cVar.d = true;
            if (bVar != null && cVar.c) {
                cVar.c = false;
                bVar.a(cVar.a, cVar.b.b());
            }
        }
        this.e.clear();
    }

    public final void e(int i, a<T> aVar) {
        c(i, aVar);
        b();
    }

    public gb6(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }
}
