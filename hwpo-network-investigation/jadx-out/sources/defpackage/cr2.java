package defpackage;

import android.net.Uri;
import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cr2 implements ns3 {
    public ul8 t;
    public boolean u;
    public zt2 v;
    public int w;
    public int x;
    public int y;
    public static final int[] z = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final a A = new a(new ar2());
    public static final a B = new a(new br2());

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final InterfaceC0068a a;
        public final AtomicBoolean b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: cr2$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public interface InterfaceC0068a {
            Constructor<? extends js3> a();
        }

        public a(InterfaceC0068a interfaceC0068a) {
            this.a = interfaceC0068a;
        }

        public final js3 a(Object... objArr) {
            Constructor<? extends js3> constructorA;
            synchronized (this.b) {
                if (!this.b.get()) {
                    try {
                        constructorA = this.a.a();
                    } catch (ClassNotFoundException unused) {
                        this.b.set(true);
                        constructorA = null;
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating extension", e);
                    }
                }
                constructorA = null;
            }
            if (constructorA == null) {
                return null;
            }
            try {
                return constructorA.newInstance(objArr);
            } catch (Exception e2) {
                throw new IllegalStateException("Unexpected error creating extractor", e2);
            }
        }
    }

    @Override // defpackage.ns3
    public final synchronized js3[] a() {
        return b(Uri.EMPTY, new HashMap());
    }

    @Override // defpackage.ns3
    public final synchronized js3[] b(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        try {
            int[] iArr = z;
            arrayList = new ArrayList(21);
            List<String> list = map.get("Content-Type");
            int iA = w20.a((list == null || list.isEmpty()) ? null : list.get(0));
            if (iA != -1) {
                c(iA, arrayList);
            }
            int iB = w20.b(uri);
            if (iB != -1 && iB != iA) {
                c(iB, arrayList);
            }
            for (int i = 0; i < 21; i++) {
                int i2 = iArr[i];
                if (i2 != iA && i2 != iB) {
                    c(i2, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (js3[]) arrayList.toArray(new js3[0]);
    }

    public final void c(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new d3());
                break;
            case 1:
                arrayList.add(new h3());
                break;
            case 2:
                arrayList.add(new zd(0));
                break;
            case 3:
                arrayList.add(new mi());
                break;
            case 4:
                js3 js3VarA = A.a(0);
                if (js3VarA == null) {
                    arrayList.add(new s34());
                } else {
                    arrayList.add(js3VarA);
                }
                break;
            case 5:
                arrayList.add(new h84());
                break;
            case 6:
                arrayList.add(new al6(this.v, this.u ? 0 : 2));
                break;
            case 7:
                arrayList.add(new pz6(0));
                break;
            case 8:
                zt2 zt2Var = this.v;
                int i2 = this.w;
                int i3 = (i2 & 1) != 0 ? 64 : 0;
                if ((i2 & 2) != 0) {
                    i3 |= 128;
                }
                int i4 = (this.u ? 0 : 32) | i3;
                k95.b bVar = k95.u;
                arrayList.add(new bh4(zt2Var, i4, null, ul8.x));
                zt2 zt2Var2 = this.v;
                int i5 = this.w;
                int i6 = (i5 & 1) == 0 ? 0 : 32;
                if ((2 & i5) != 0) {
                    i6 |= 128;
                }
                arrayList.add(new vz6(zt2Var2, i6 | (this.u ? 0 : 16)));
                break;
            case 9:
                arrayList.add(new eg7());
                break;
            case 10:
                arrayList.add(new uf8());
                break;
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (this.t == null) {
                    k95.b bVar2 = k95.u;
                    this.t = ul8.x;
                }
                arrayList.add(new oya(1, !this.u ? 1 : 0, this.v, new apa(0L), new fv2(0, this.t)));
                break;
            case 12:
                arrayList.add(new gkb());
                break;
            case 14:
                arrayList.add(new ql5(this.x));
                break;
            case h4c.e /* 15 */:
                js3 js3VarA2 = B.a(new Object[0]);
                if (js3VarA2 != null) {
                    arrayList.add(js3VarA2);
                }
                break;
            case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                arrayList.add(new rg0(!this.u ? 1 : 0, this.v));
                break;
            case 17:
                arrayList.add(new q48());
                break;
            case 18:
                arrayList.add(new flb());
                break;
            case 19:
                arrayList.add(new or0());
                break;
            case InboxPagingSource.PAGE_SIZE /* 20 */:
                arrayList.add(new av4(this.y));
                break;
            case 21:
                arrayList.add(new ug0());
                break;
        }
    }
}
