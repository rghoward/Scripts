package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w51 implements s4a {
    public final ArrayDeque<a> a = new ArrayDeque<>();
    public final ArrayDeque<w4a> b;
    public final ArrayDeque<a> c;
    public a d;
    public long e;
    public long f;
    public long g;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends v4a implements Comparable<a> {
        public long C;

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            a aVar2 = aVar;
            if (i(4) != aVar2.i(4)) {
                return i(4) ? 1 : -1;
            }
            long j = this.y - aVar2.y;
            if (j == 0) {
                j = this.C - aVar2.C;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends w4a {
        public v51 y;

        @Override // defpackage.on2
        public final void k() {
            w51 w51Var = this.y.a;
            j();
            w51Var.b.add(this);
        }
    }

    public w51() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new a());
        }
        this.b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque<w4a> arrayDeque = this.b;
            v51 v51Var = new v51(this);
            b bVar = new b();
            bVar.y = v51Var;
            arrayDeque.add(bVar);
        }
        this.c = new ArrayDeque<>();
        this.g = -9223372036854775807L;
    }

    @Override // defpackage.kn2
    public final void b(long j) {
        this.g = j;
    }

    @Override // defpackage.s4a
    public final void c(long j) {
        this.e = j;
    }

    @Override // defpackage.kn2
    public final v4a e() {
        xl7.r(this.d == null);
        ArrayDeque<a> arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        a aVarPollFirst = arrayDeque.pollFirst();
        this.d = aVarPollFirst;
        return aVarPollFirst;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    @Override // defpackage.kn2
    public final void f(v4a v4aVar) {
        xl7.g(v4aVar == this.d);
        a aVar = (a) v4aVar;
        if (aVar.i(4)) {
            long j = this.f;
            this.f = 1 + j;
            aVar.C = j;
            this.c.add(aVar);
        } else {
            long j2 = aVar.y;
            if (j2 != Long.MIN_VALUE) {
                long j3 = this.g;
                if (j3 == -9223372036854775807L || j2 >= j3) {
                    long j4 = this.f;
                    this.f = 1 + j4;
                    aVar.C = j4;
                    this.c.add(aVar);
                } else {
                    aVar.j();
                    this.a.add(aVar);
                }
            } else {
                long j5 = this.f;
                this.f = 1 + j5;
                aVar.C = j5;
                this.c.add(aVar);
            }
        }
        this.d = null;
    }

    @Override // defpackage.kn2
    public void flush() {
        ArrayDeque<a> arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            ArrayDeque<a> arrayDeque2 = this.c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.a;
            if (zIsEmpty) {
                break;
            }
            a aVarPoll = arrayDeque2.poll();
            String str = n6b.a;
            aVarPoll.j();
            arrayDeque.add(aVarPoll);
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.j();
            arrayDeque.add(aVar);
            this.d = null;
        }
    }

    public abstract x51 g();

    public abstract void h(a aVar);

    @Override // defpackage.kn2
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public w4a d() {
        ArrayDeque<w4a> arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque<a> arrayDeque2 = this.c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            a aVarPeek = arrayDeque2.peek();
            String str = n6b.a;
            if (aVarPeek.y > this.e) {
                return null;
            }
            a aVarPoll = arrayDeque2.poll();
            boolean zI = aVarPoll.i(4);
            ArrayDeque<a> arrayDeque3 = this.a;
            if (zI) {
                w4a w4aVarPollFirst = arrayDeque.pollFirst();
                w4aVarPollFirst.h(4);
                aVarPoll.j();
                arrayDeque3.add(aVarPoll);
                return w4aVarPollFirst;
            }
            h(aVarPoll);
            if (j()) {
                x51 x51VarG = g();
                w4a w4aVarPollFirst2 = arrayDeque.pollFirst();
                long j = aVarPoll.y;
                w4aVarPollFirst2.u = j;
                w4aVarPollFirst2.w = x51VarG;
                w4aVarPollFirst2.x = j;
                aVarPoll.j();
                arrayDeque3.add(aVarPoll);
                return w4aVarPollFirst2;
            }
            aVarPoll.j();
            arrayDeque3.add(aVarPoll);
        }
    }

    public abstract boolean j();

    @Override // defpackage.kn2
    public void a() {
    }
}
