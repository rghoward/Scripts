package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class rx2 implements yc9<fg5> {
    public final CharSequence a;
    public final int b;
    public final ci4<CharSequence, Integer, js7<Integer, Integer>> c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Iterator<fg5>, zn5 {
        public int t = -1;
        public int u;
        public int v;
        public fg5 w;
        public int x;

        public a() {
            int iG = uh8.g(0, 0, rx2.this.a.length());
            this.u = iG;
            this.v = iG;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001c  */
        /* JADX WARN: Code duplicated, block: B:12:0x0022  */
        /* JADX WARN: Code duplicated, block: B:13:0x0036  */
        /* JADX WARN: Code duplicated, block: B:15:0x0046  */
        /* JADX WARN: Code duplicated, block: B:16:0x005a  */
        /* JADX WARN: Code duplicated, block: B:18:0x0077  */
        public final void a() {
            js7<Integer, Integer> js7VarInvoke;
            rx2 rx2Var = rx2.this;
            CharSequence charSequence = rx2Var.a;
            int i = this.v;
            if (i < 0) {
                this.t = 0;
                this.w = null;
                return;
            }
            int i2 = rx2Var.b;
            if (i2 > 0) {
                int i3 = this.x + 1;
                this.x = i3;
                if (i3 >= i2) {
                    int i4 = this.u;
                    charSequence.getClass();
                    this.w = new fg5(i4, charSequence.length() - 1, 1);
                    this.v = -1;
                } else if (i > charSequence.length()) {
                    int i5 = this.u;
                    charSequence.getClass();
                    this.w = new fg5(i5, charSequence.length() - 1, 1);
                    this.v = -1;
                } else {
                    js7VarInvoke = rx2Var.c.invoke(charSequence, Integer.valueOf(this.v));
                    if (js7VarInvoke == null) {
                        int i6 = this.u;
                        charSequence.getClass();
                        this.w = new fg5(i6, charSequence.length() - 1, 1);
                        this.v = -1;
                    } else {
                        int iIntValue = js7VarInvoke.t.intValue();
                        int iIntValue2 = js7VarInvoke.u.intValue();
                        this.w = uh8.j(this.u, iIntValue);
                        int i7 = iIntValue + iIntValue2;
                        this.u = i7;
                        this.v = i7 + (iIntValue2 == 0 ? 1 : 0);
                    }
                }
            } else if (i > charSequence.length()) {
                int i8 = this.u;
                charSequence.getClass();
                this.w = new fg5(i8, charSequence.length() - 1, 1);
                this.v = -1;
            } else {
                js7VarInvoke = rx2Var.c.invoke(charSequence, Integer.valueOf(this.v));
                if (js7VarInvoke == null) {
                    int i9 = this.u;
                    charSequence.getClass();
                    this.w = new fg5(i9, charSequence.length() - 1, 1);
                    this.v = -1;
                } else {
                    int iIntValue3 = js7VarInvoke.t.intValue();
                    int iIntValue4 = js7VarInvoke.u.intValue();
                    this.w = uh8.j(this.u, iIntValue3);
                    int i10 = iIntValue3 + iIntValue4;
                    this.u = i10;
                    this.v = i10 + (iIntValue4 == 0 ? 1 : 0);
                }
            }
            this.t = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.t == -1) {
                a();
            }
            return this.t == 1;
        }

        @Override // java.util.Iterator
        public final fg5 next() {
            if (this.t == -1) {
                a();
            }
            if (this.t == 0) {
                vl.b();
                return null;
            }
            fg5 fg5Var = this.w;
            fg5Var.getClass();
            this.w = null;
            this.t = -1;
            return fg5Var;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public rx2(CharSequence charSequence, int i, ci4 ci4Var) {
        charSequence.getClass();
        this.a = charSequence;
        this.b = i;
        this.c = ci4Var;
    }

    @Override // defpackage.yc9
    public final Iterator<fg5> iterator() {
        return new a();
    }
}
