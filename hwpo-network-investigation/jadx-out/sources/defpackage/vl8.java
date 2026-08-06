package defpackage;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vl8<K, V> extends m95<K, V> {
    public static final vl8 z = new vl8(0, null, new Object[0]);
    public final transient Object w;
    public final transient Object[] x;
    public final transient int y;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a<K, V> extends q95<Map.Entry<K, V>> {
        public final transient vl8 w;
        public final transient Object[] x;
        public final transient int y;

        /* JADX INFO: renamed from: vl8$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class C0274a extends k95<Map.Entry<K, V>> {
            public C0274a() {
            }

            @Override // java.util.List
            public final Object get(int i) {
                a aVar = a.this;
                xl7.k(i, aVar.y);
                Object[] objArr = aVar.x;
                int i2 = i * 2;
                Object obj = objArr[i2];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i2 + 1];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // defpackage.b95
            public final boolean k() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return a.this.y;
            }
        }

        public a(vl8 vl8Var, Object[] objArr, int i) {
            this.w = vl8Var;
            this.x = objArr;
            this.y = i;
        }

        @Override // defpackage.b95, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.w.get(key));
        }

        @Override // defpackage.b95
        public final int e(int i, Object[] objArr) {
            return d().e(i, objArr);
        }

        @Override // defpackage.b95
        public final boolean k() {
            return true;
        }

        @Override // defpackage.b95, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* JADX INFO: renamed from: l */
        public final w2b iterator() {
            return d().listIterator(0);
        }

        @Override // defpackage.q95
        public final k95<Map.Entry<K, V>> q() {
            return new C0274a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.y;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b<K> extends q95<K> {
        public final transient vl8 w;
        public final transient c x;

        public b(vl8 vl8Var, c cVar) {
            this.w = vl8Var;
            this.x = cVar;
        }

        @Override // defpackage.b95, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.w.get(obj) != null;
        }

        @Override // defpackage.q95, defpackage.b95
        public final k95<K> d() {
            return this.x;
        }

        @Override // defpackage.b95
        public final int e(int i, Object[] objArr) {
            return this.x.e(i, objArr);
        }

        @Override // defpackage.b95
        public final boolean k() {
            return true;
        }

        @Override // defpackage.b95, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* JADX INFO: renamed from: l */
        public final w2b iterator() {
            return this.x.listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.w.y;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends k95<Object> {
        public final transient Object[] v;
        public final transient int w;
        public final transient int x;

        public c(int i, int i2, Object[] objArr) {
            this.v = objArr;
            this.w = i;
            this.x = i2;
        }

        @Override // java.util.List
        public final Object get(int i) {
            xl7.k(i, this.x);
            Object obj = this.v[(i * 2) + this.w];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // defpackage.b95
        public final boolean k() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.x;
        }
    }

    public vl8(int i, Object obj, Object[] objArr) {
        this.w = obj;
        this.x = objArr;
        this.y = i;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0199  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    public static <K, V> vl8<K, V> f(int i, Object[] objArr, m95.a<K, V> aVar) {
        boolean z2;
        int i2;
        char c2;
        ?? r3;
        char c3;
        short[] sArr;
        boolean z3;
        int i3;
        ?? r16;
        boolean z4;
        ?? r4;
        Object[] objArr2;
        m95.a.C0201a c0201a;
        boolean z5;
        int i4 = i;
        Object[] objArrCopyOf = objArr;
        if (i4 == 0) {
            return z;
        }
        m95.a.C0201a c0201a2 = null;
        ?? r5 = 0;
        m95.a.C0201a c0201a3 = null;
        m95.a.C0201a c0201a4 = null;
        boolean z6 = false;
        int i5 = 1;
        if (i4 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new vl8<>(1, null, objArrCopyOf);
        }
        xl7.o(i4, objArrCopyOf.length >> 1);
        int iN = q95.n(i4);
        char c4 = 2;
        if (i4 != 1) {
            int i6 = iN - 1;
            if (iN <= 128) {
                byte[] bArr = new byte[iN];
                Arrays.fill(bArr, (byte) -1);
                int i7 = 0;
                int i8 = 0;
                while (i7 < i4) {
                    int i9 = i7 * 2;
                    int i10 = i8 * 2;
                    Object obj = objArrCopyOf[i9];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArrCopyOf[i9 ^ i5];
                    Objects.requireNonNull(obj2);
                    int iD = su0.d(obj.hashCode());
                    while (true) {
                        int i11 = iD & i6;
                        z3 = z6;
                        i3 = i5;
                        int i12 = bArr[i11] & MessagePack.Code.EXT_TIMESTAMP;
                        if (i12 == 255) {
                            bArr[i11] = (byte) i10;
                            if (i8 < i7) {
                                objArrCopyOf[i10] = obj;
                                objArrCopyOf[i10 ^ 1] = obj2;
                            }
                            i8++;
                            break;
                        }
                        if (obj.equals(objArrCopyOf[i12 == true ? 1 : 0])) {
                            int i13 = ~i12;
                            Object obj3 = objArrCopyOf[i13 == true ? 1 : 0];
                            Objects.requireNonNull(obj3);
                            c0201a3 = new m95.a.C0201a(obj, obj2, obj3);
                            objArrCopyOf[i13 == true ? 1 : 0] = obj2;
                            break;
                        }
                        iD = i11 + 1;
                        z6 = z3;
                        i5 = i3;
                    }
                    i7++;
                    z6 = z3;
                    i5 = i3;
                }
                z2 = z6;
                i2 = i5;
                if (i8 == i4) {
                    r5 = bArr;
                    z5 = z2;
                } else {
                    sArr = new Object[3];
                    sArr[z2 ? 1 : 0] = bArr;
                    sArr[i2] = Integer.valueOf(i8);
                    sArr[2] = c0201a3;
                    r5 = sArr;
                    z5 = z2;
                }
            } else {
                z2 = false;
                i2 = 1;
                if (iN <= 32768) {
                    sArr = new short[iN];
                    Arrays.fill(sArr, (short) -1);
                    int i14 = 0;
                    for (int i15 = 0; i15 < i4; i15++) {
                        int i16 = i15 * 2;
                        int i17 = i14 * 2;
                        Object obj4 = objArrCopyOf[i16];
                        Objects.requireNonNull(obj4);
                        Object obj5 = objArrCopyOf[i16 ^ 1];
                        Objects.requireNonNull(obj5);
                        int iD2 = su0.d(obj4.hashCode());
                        while (true) {
                            int i18 = iD2 & i6;
                            int i19 = sArr[i18] & 65535;
                            if (i19 == 65535) {
                                sArr[i18] = (short) i17;
                                if (i14 < i15) {
                                    objArrCopyOf[i17] = obj4;
                                    objArrCopyOf[i17 ^ 1] = obj5;
                                }
                                i14++;
                                break;
                            }
                            if (obj4.equals(objArrCopyOf[i19 == true ? 1 : 0])) {
                                int i20 = ~i19;
                                Object obj6 = objArrCopyOf[i20 == true ? 1 : 0];
                                Objects.requireNonNull(obj6);
                                c0201a4 = new m95.a.C0201a(obj4, obj5, obj6);
                                objArrCopyOf[i20 == true ? 1 : 0] = obj5;
                                break;
                            }
                            iD2 = i18 + 1;
                        }
                    }
                    if (i14 == i4) {
                        r5 = sArr;
                        z5 = z2;
                    } else {
                        r5 = new Object[]{sArr, Integer.valueOf(i14), c0201a4};
                        z5 = z2;
                    }
                } else {
                    int[] iArr = new int[iN];
                    Arrays.fill(iArr, -1);
                    int i21 = 0;
                    int i22 = 0;
                    while (i21 < i4) {
                        int i23 = i21 * 2;
                        int i24 = i22 * 2;
                        Object obj7 = objArrCopyOf[i23];
                        Objects.requireNonNull(obj7);
                        Object obj8 = objArrCopyOf[i23 ^ 1];
                        Objects.requireNonNull(obj8);
                        int iD3 = su0.d(obj7.hashCode());
                        while (true) {
                            int i25 = iD3 & i6;
                            int i26 = iArr[i25];
                            if (i26 == -1) {
                                iArr[i25] = i24;
                                if (i22 < i21) {
                                    objArrCopyOf[i24] = obj7;
                                    objArrCopyOf[i24 ^ 1] = obj8;
                                }
                                i22++;
                                c3 = c4;
                                break;
                            }
                            c3 = c4;
                            if (obj7.equals(objArrCopyOf[i26])) {
                                int i27 = i26 ^ 1;
                                Object obj9 = objArrCopyOf[i27];
                                Objects.requireNonNull(obj9);
                                c0201a2 = new m95.a.C0201a(obj7, obj8, obj9);
                                objArrCopyOf[i27] = obj8;
                                break;
                            }
                            iD3 = i25 + 1;
                            c4 = c3;
                        }
                        i21++;
                        c4 = c3;
                    }
                    c2 = c4;
                    if (i22 == i4) {
                        r3 = iArr;
                        r16 = z2;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i22);
                        objArr3[c2] = c0201a2;
                        r3 = objArr3;
                        r16 = z2;
                    }
                }
            }
            z4 = r3 instanceof Object[];
            r4 = r3;
            if (z4) {
                objArr2 = (Object[]) r3;
                c0201a = (m95.a.C0201a) objArr2[c2];
                if (aVar != null) {
                    throw c0201a.a();
                }
                aVar.c = c0201a;
                Object obj10 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i2]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue * 2);
                r4 = obj10;
                i4 = iIntValue;
            }
            return new vl8<>(i4, r4, objArrCopyOf);
        }
        Objects.requireNonNull(objArrCopyOf[0]);
        Objects.requireNonNull(objArrCopyOf[1]);
        z5 = false;
        i2 = 1;
        c2 = 2;
        r3 = r5;
        r16 = z5;
        z4 = r3 instanceof Object[];
        r4 = r3;
        if (z4) {
            objArr2 = (Object[]) r3;
            c0201a = (m95.a.C0201a) objArr2[c2];
            if (aVar != null) {
                throw c0201a.a();
            }
            aVar.c = c0201a;
            Object obj11 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i2]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 * 2);
            r4 = obj11;
            i4 = iIntValue2;
        }
        return new vl8<>(i4, r4, objArrCopyOf);
    }

    @Override // defpackage.m95
    public final a c() {
        return new a(this, this.x, this.y);
    }

    @Override // defpackage.m95
    public final b d() {
        return new b(this, new c(0, this.y, this.x));
    }

    @Override // defpackage.m95
    public final c e() {
        return new c(1, this.y, this.x);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // defpackage.m95, java.util.Map
    public final V get(Object obj) {
        V v;
        if (obj == null) {
            v = null;
        } else {
            Object[] objArr = this.x;
            if (this.y == 1) {
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                if (obj2.equals(obj)) {
                    v = (V) objArr[1];
                    Objects.requireNonNull(v);
                } else {
                    v = null;
                }
            } else {
                Object obj3 = this.w;
                if (obj3 == null) {
                    v = null;
                } else if (obj3 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj3;
                    int length = bArr.length - 1;
                    int iD = su0.d(obj.hashCode());
                    while (true) {
                        int i = iD & length;
                        int i2 = bArr[i] & MessagePack.Code.EXT_TIMESTAMP;
                        if (i2 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i2])) {
                            v = (V) objArr[i2 ^ 1];
                        } else {
                            iD = i + 1;
                        }
                    }
                    v = null;
                } else if (obj3 instanceof short[]) {
                    short[] sArr = (short[]) obj3;
                    int length2 = sArr.length - 1;
                    int iD2 = su0.d(obj.hashCode());
                    while (true) {
                        int i3 = iD2 & length2;
                        int i4 = sArr[i3] & 65535;
                        if (i4 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i4])) {
                            v = (V) objArr[i4 ^ 1];
                        } else {
                            iD2 = i3 + 1;
                        }
                    }
                    v = null;
                } else {
                    int[] iArr = (int[]) obj3;
                    int length3 = iArr.length - 1;
                    int iD3 = su0.d(obj.hashCode());
                    while (true) {
                        int i5 = iD3 & length3;
                        int i6 = iArr[i5];
                        if (i6 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i6])) {
                            v = (V) objArr[i6 ^ 1];
                        } else {
                            iD3 = i5 + 1;
                        }
                    }
                    v = null;
                }
            }
        }
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // java.util.Map
    public final int size() {
        return this.y;
    }
}
