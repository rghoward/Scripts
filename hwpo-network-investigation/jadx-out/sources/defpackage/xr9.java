package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", l = {34, 40, 49, 55, 58}, m = "invokeSuspend", v = 2)
public final class xr9 extends zu8 implements ci4<ad9<? super List<Object>>, r02<? super g2b>, Object> {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Iterator<Object> C;
    public Object u;
    public Iterator v;
    public int w;
    public int x;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr9(int i, int i2, Iterator it, r02 r02Var) {
        super(2, r02Var);
        this.A = i;
        this.B = i2;
        this.C = it;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        xr9 xr9Var = new xr9(this.A, this.B, this.C, r02Var);
        xr9Var.z = obj;
        return xr9Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(ad9<? super List<Object>> ad9Var, r02<? super g2b> r02Var) {
        return ((xr9) create(ad9Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:48:0x0101  */
    /* JADX WARN: Code duplicated, block: B:51:0x0106  */
    /* JADX WARN: Code duplicated, block: B:52:0x010b  */
    /* JADX WARN: Code duplicated, block: B:62:0x013e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0153  */
    /* JADX WARN: Code duplicated, block: B:66:0x0159  */
    /* JADX WARN: Code duplicated, block: B:70:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0082 A[SYNTHETIC] */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        int i2;
        int i3;
        Iterator<Object> it;
        pw8 pw8Var;
        ArrayList arrayList;
        int i4;
        Iterator<Object> it2;
        int i5;
        Object next;
        int i6;
        Object[] objArr;
        int i7;
        pw8 pw8Var2;
        Object next2;
        boolean z;
        int i8;
        Object[] array;
        ad9 ad9Var = (ad9) this.z;
        int i9 = this.y;
        int i10 = this.B;
        boolean z2 = true;
        int i11 = this.A;
        v72 v72Var = v72.t;
        if (i9 == 0) {
            dv8.b(obj);
            int i12 = i11 <= 1024 ? i11 : 1024;
            i = i10 - i11;
            Iterator<Object> it3 = this.C;
            if (i >= 0) {
                arrayList = new ArrayList(i12);
                i4 = i12;
                it2 = it3;
                i5 = 0;
                while (it2.hasNext()) {
                    next = it2.next();
                    if (i5 > 0) {
                        i5--;
                    } else {
                        arrayList.add(next);
                        if (arrayList.size() == i11) {
                            this.z = ad9Var;
                            this.u = arrayList;
                            this.v = it2;
                            this.w = i4;
                            this.x = i;
                            this.y = 1;
                            ad9Var.a(this, arrayList);
                            return v72Var;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.z = null;
                    this.u = null;
                    this.v = null;
                    this.w = i4;
                    this.x = i;
                    this.y = 2;
                    ad9Var.a(this, arrayList);
                    return v72Var;
                }
            } else {
                pw8 pw8Var3 = new pw8(0, new Object[i12]);
                i2 = i12;
                i3 = i;
                it = it3;
                pw8Var = pw8Var3;
                while (true) {
                    i6 = pw8Var.u;
                    objArr = pw8Var.t;
                    if (it.hasNext()) {
                        i7 = i2;
                        pw8Var2 = pw8Var;
                        break;
                    }
                    next2 = it.next();
                    z = z2;
                    if (pw8Var.d() != i6) {
                        aa0.c("ring buffer is full");
                        return null;
                    }
                    int i13 = pw8Var.v;
                    int i14 = pw8Var.w;
                    objArr[(i13 + i14) % i6] = next2;
                    pw8Var.w = i14 + 1;
                    if (pw8Var.d() != i6) {
                        if (pw8Var.w < i11) {
                            ArrayList arrayList2 = new ArrayList(pw8Var);
                            this.z = ad9Var;
                            this.u = pw8Var;
                            this.v = it;
                            this.w = i2;
                            this.x = i3;
                            this.y = 3;
                            ad9Var.a(this, arrayList2);
                            return v72Var;
                        }
                        i8 = i6 + (i6 >> 1) + 1;
                        if (i8 > i11) {
                            i8 = i11;
                        }
                        if (pw8Var.v == 0) {
                            array = Arrays.copyOf(objArr, i8);
                        } else {
                            array = pw8Var.toArray(new Object[i8]);
                        }
                        pw8Var = new pw8(pw8Var.w, array);
                    }
                    z2 = z;
                }
                if (pw8Var2.w > i10) {
                    ArrayList arrayList3 = new ArrayList(pw8Var2);
                    this.z = ad9Var;
                    this.u = pw8Var2;
                    this.v = null;
                    this.w = i7;
                    this.x = i3;
                    this.y = 4;
                    ad9Var.a(this, arrayList3);
                    return v72Var;
                }
                if (!pw8Var2.isEmpty()) {
                    this.z = null;
                    this.u = null;
                    this.v = null;
                    this.w = i7;
                    this.x = i3;
                    this.y = 5;
                    ad9Var.a(this, pw8Var2);
                    return v72Var;
                }
            }
        } else if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    i3 = this.x;
                    i2 = this.w;
                    it = this.v;
                    pw8Var = (pw8) this.u;
                    dv8.b(obj);
                    pw8Var.e(i10);
                    while (true) {
                        i6 = pw8Var.u;
                        objArr = pw8Var.t;
                        if (it.hasNext()) {
                            i7 = i2;
                            pw8Var2 = pw8Var;
                            break;
                        }
                        next2 = it.next();
                        z = z2;
                        if (pw8Var.d() != i6) {
                            aa0.c("ring buffer is full");
                            return null;
                        }
                        int i15 = pw8Var.v;
                        int i16 = pw8Var.w;
                        objArr[(i15 + i16) % i6] = next2;
                        pw8Var.w = i16 + 1;
                        if (pw8Var.d() != i6) {
                            if (pw8Var.w < i11) {
                                ArrayList arrayList4 = new ArrayList(pw8Var);
                                this.z = ad9Var;
                                this.u = pw8Var;
                                this.v = it;
                                this.w = i2;
                                this.x = i3;
                                this.y = 3;
                                ad9Var.a(this, arrayList4);
                                return v72Var;
                            }
                            i8 = i6 + (i6 >> 1) + 1;
                            if (i8 > i11) {
                                i8 = i11;
                            }
                            if (pw8Var.v == 0) {
                                array = Arrays.copyOf(objArr, i8);
                            } else {
                                array = pw8Var.toArray(new Object[i8]);
                            }
                            pw8Var = new pw8(pw8Var.w, array);
                        }
                        z2 = z;
                    }
                } else if (i9 == 4) {
                    i3 = this.x;
                    i7 = this.w;
                    pw8Var2 = (pw8) this.u;
                    dv8.b(obj);
                    pw8Var2.e(i10);
                } else {
                    if (i9 != 5) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                if (pw8Var2.w > i10) {
                    ArrayList arrayList5 = new ArrayList(pw8Var2);
                    this.z = ad9Var;
                    this.u = pw8Var2;
                    this.v = null;
                    this.w = i7;
                    this.x = i3;
                    this.y = 4;
                    ad9Var.a(this, arrayList5);
                    return v72Var;
                }
                if (!pw8Var2.isEmpty()) {
                    this.z = null;
                    this.u = null;
                    this.v = null;
                    this.w = i7;
                    this.x = i3;
                    this.y = 5;
                    ad9Var.a(this, pw8Var2);
                    return v72Var;
                }
            }
            dv8.b(obj);
        } else {
            i5 = this.x;
            i4 = this.w;
            it2 = this.v;
            dv8.b(obj);
            arrayList = new ArrayList(i11);
            i = i5;
            while (it2.hasNext()) {
                next = it2.next();
                if (i5 > 0) {
                    i5--;
                } else {
                    arrayList.add(next);
                    if (arrayList.size() == i11) {
                        this.z = ad9Var;
                        this.u = arrayList;
                        this.v = it2;
                        this.w = i4;
                        this.x = i;
                        this.y = 1;
                        ad9Var.a(this, arrayList);
                        return v72Var;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.z = null;
                this.u = null;
                this.v = null;
                this.w = i4;
                this.x = i;
                this.y = 2;
                ad9Var.a(this, arrayList);
                return v72Var;
            }
        }
        return g2b.a;
    }
}
