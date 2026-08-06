package defpackage;

import android.text.TextUtils;
import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class np6 {
    public static final np6 B;
    public final k95<String> A;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final byte[] f;
    public final Integer g;
    public final Integer h;
    public final Integer i;

    @Deprecated
    public final Integer j;
    public final Boolean k;

    @Deprecated
    public final Integer l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Integer r;
    public final CharSequence s;
    public final CharSequence t;
    public final CharSequence u;
    public final Integer v;
    public final Integer w;
    public final CharSequence x;
    public final CharSequence y;
    public final Integer z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public CharSequence a;
        public CharSequence b;
        public CharSequence c;
        public CharSequence d;
        public CharSequence e;
        public byte[] f;
        public Integer g;
        public Integer h;
        public Integer i;
        public Integer j;
        public Boolean k;
        public Integer l;
        public Integer m;
        public Integer n;
        public Integer o;
        public Integer p;
        public Integer q;
        public CharSequence r;
        public CharSequence s;
        public CharSequence t;
        public Integer u;
        public Integer v;
        public CharSequence w;
        public CharSequence x;
        public Integer y;
        public k95<String> z;

        public final void a(byte[] bArr, int i) {
            if (this.f == null || i == 3 || !Objects.equals(this.g, 3)) {
                this.f = (byte[]) bArr.clone();
                this.g = Integer.valueOf(i);
            }
        }
    }

    static {
        a aVar = new a();
        k95.b bVar = k95.u;
        aVar.z = ul8.x;
        B = new np6(aVar);
        ra.b(0, 1, 2, 3, 4);
        ra.b(5, 6, 8, 9, 10);
        ra.b(11, 12, 13, 14, 15);
        ra.b(16, 17, 18, 19, 20);
        ra.b(21, 22, 23, 24, 25);
        ra.b(26, 27, 28, 29, 30);
        ra.b(31, 32, 33, 34, 1000);
    }

    public np6(a aVar) {
        Boolean boolValueOf = aVar.k;
        Integer numValueOf = aVar.j;
        Integer numValueOf2 = aVar.y;
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        case 12:
                        case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        case 14:
                        case h4c.e /* 15 */:
                        case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case InboxPagingSource.PAGE_SIZE /* 20 */:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i3 = i;
                }
                numValueOf = Integer.valueOf(i3);
            }
        } else if (numValueOf != null) {
            boolean z = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z);
            if (z && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i2);
            }
        }
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = numValueOf;
        this.k = boolValueOf;
        Integer num = aVar.l;
        this.l = num;
        this.m = num;
        this.n = aVar.m;
        this.o = aVar.n;
        this.p = aVar.o;
        this.q = aVar.p;
        this.r = aVar.q;
        this.s = aVar.r;
        this.t = aVar.s;
        this.u = aVar.t;
        this.v = aVar.u;
        this.w = aVar.v;
        this.x = aVar.w;
        this.y = aVar.x;
        this.z = numValueOf2;
        this.A = aVar.z;
    }

    public final a a() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
        aVar.h = this.h;
        aVar.i = this.i;
        aVar.j = this.j;
        aVar.k = this.k;
        aVar.l = this.m;
        aVar.m = this.n;
        aVar.n = this.o;
        aVar.o = this.p;
        aVar.p = this.q;
        aVar.q = this.r;
        aVar.r = this.s;
        aVar.s = this.t;
        aVar.t = this.u;
        aVar.u = this.v;
        aVar.v = this.w;
        aVar.w = this.x;
        aVar.x = this.y;
        aVar.y = this.z;
        aVar.z = this.A;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || np6.class != obj.getClass()) {
            return false;
        }
        np6 np6Var = (np6) obj;
        return TextUtils.equals(this.a, np6Var.a) && TextUtils.equals(this.b, np6Var.b) && TextUtils.equals(this.c, np6Var.c) && TextUtils.equals(this.d, np6Var.d) && TextUtils.equals(null, null) && TextUtils.equals(null, null) && TextUtils.equals(this.e, np6Var.e) && Arrays.equals(this.f, np6Var.f) && Objects.equals(this.g, np6Var.g) && Objects.equals(this.h, np6Var.h) && Objects.equals(this.i, np6Var.i) && Objects.equals(this.j, np6Var.j) && Objects.equals(this.k, np6Var.k) && Objects.equals(this.m, np6Var.m) && Objects.equals(this.n, np6Var.n) && Objects.equals(this.o, np6Var.o) && Objects.equals(this.p, np6Var.p) && Objects.equals(this.q, np6Var.q) && Objects.equals(this.r, np6Var.r) && TextUtils.equals(this.s, np6Var.s) && TextUtils.equals(this.t, np6Var.t) && TextUtils.equals(this.u, np6Var.u) && Objects.equals(this.v, np6Var.v) && Objects.equals(this.w, np6Var.w) && TextUtils.equals(this.x, np6Var.x) && TextUtils.equals(null, null) && TextUtils.equals(this.y, np6Var.y) && Objects.equals(this.z, np6Var.z) && Objects.equals(this.A, np6Var.A);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, null, null, this.e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f)), this.g, null, this.h, this.i, this.j, this.k, null, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, null, this.y, this.z, true, this.A);
    }
}
