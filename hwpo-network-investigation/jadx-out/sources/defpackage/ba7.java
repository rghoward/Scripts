package defpackage;

import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.intercom.twig.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ba7 extends g20 implements ce9 {
    public static final dp A = dp.d();
    public final List<hv7> t;
    public final GaugeManager u;
    public final oxa v;
    public final z97.a w;
    public final WeakReference<ce9> x;
    public String y;
    public boolean z;

    /* JADX WARN: Illegal instructions before constructor call */
    public ba7(oxa oxaVar) {
        f20 f20VarA = f20.a();
        GaugeManager gaugeManager = GaugeManager.getInstance();
        super(f20VarA);
        this.w = z97.e0();
        this.x = new WeakReference<>(this);
        this.v = oxaVar;
        this.u = gaugeManager;
        this.t = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }

    @Override // defpackage.ce9
    public final void a(hv7 hv7Var) {
        if (hv7Var == null) {
            A.f("Unable to add new SessionId to the Network Trace. Continuing without it.");
            return;
        }
        z97.a aVar = this.w;
        if (!((z97) aVar.u).W() || ((z97) aVar.u).c0()) {
            return;
        }
        this.t.add(hv7Var);
    }

    public final void b() {
        List listUnmodifiableList;
        SessionManager.getInstance().unregisterForSessionUpdates(this.x);
        unregisterForAppState();
        synchronized (this.t) {
            try {
                ArrayList arrayList = new ArrayList();
                for (hv7 hv7Var : this.t) {
                    if (hv7Var != null) {
                        arrayList.add(hv7Var);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        iv7[] iv7VarArrB = hv7.b(listUnmodifiableList);
        if (iv7VarArrB != null) {
            z97.a aVar = this.w;
            List listAsList = Arrays.asList(iv7VarArrB);
            aVar.n();
            z97.H((z97) aVar.u, listAsList);
        }
        final z97 z97VarL = this.w.l();
        String str = this.y;
        if (str == null) {
            Pattern pattern = ca7.a;
        } else if (ca7.a.matcher(str).matches()) {
            A.a("Dropping network request from a 'User-Agent' that is not allowed");
            return;
        }
        if (this.z) {
            return;
        }
        final oxa oxaVar = this.v;
        final o20 appState = getAppState();
        oxaVar.B.execute(new Runnable() { // from class: mxa
            @Override // java.lang.Runnable
            public final void run() {
                oxa oxaVar2 = oxaVar;
                oxaVar2.getClass();
                ev7.a aVarE = ev7.E();
                aVarE.n();
                ev7.B((ev7) aVarE.u, z97VarL);
                oxaVar2.d(aVarE, appState);
            }
        });
        this.z = true;
    }

    public final void c(String str) {
        z97.c cVar;
        if (str != null) {
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
                case "OPTIONS":
                    cVar = z97.c.OPTIONS;
                    break;
                case "GET":
                    cVar = z97.c.GET;
                    break;
                case "PUT":
                    cVar = z97.c.PUT;
                    break;
                case "HEAD":
                    cVar = z97.c.HEAD;
                    break;
                case "POST":
                    cVar = z97.c.POST;
                    break;
                case "PATCH":
                    cVar = z97.c.PATCH;
                    break;
                case "TRACE":
                    cVar = z97.c.TRACE;
                    break;
                case "CONNECT":
                    cVar = z97.c.CONNECT;
                    break;
                case "DELETE":
                    cVar = z97.c.DELETE;
                    break;
                default:
                    cVar = z97.c.HTTP_METHOD_UNKNOWN;
                    break;
            }
            z97.a aVar = this.w;
            aVar.n();
            z97.I((z97) aVar.u, cVar);
        }
    }

    public final void d(int i) {
        z97.a aVar = this.w;
        aVar.n();
        z97.A((z97) aVar.u, i);
    }

    public final void f(long j) {
        z97.a aVar = this.w;
        aVar.n();
        z97.J((z97) aVar.u, j);
    }

    public final void g(long j) {
        hv7 hv7VarPerfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.x);
        z97.a aVar = this.w;
        aVar.n();
        z97.D((z97) aVar.u, j);
        a(hv7VarPerfSession);
        if (hv7VarPerfSession.v) {
            this.u.collectGaugeMetricOnce(hv7VarPerfSession.u);
        }
    }

    public final void h(String str) {
        z97.a aVar = this.w;
        if (str == null) {
            aVar.n();
            z97.C((z97) aVar.u);
            return;
        }
        if (str.length() <= 128) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt > 31 && cCharAt <= 127) {
                }
            }
            aVar.n();
            z97.B((z97) aVar.u, str);
            return;
        }
        A.f("The content type of the response is not a valid content-type:".concat(str));
    }

    public final void j(long j) {
        z97.a aVar = this.w;
        aVar.n();
        z97.K((z97) aVar.u, j);
    }

    public final void k(long j) {
        z97.a aVar = this.w;
        aVar.n();
        z97.G((z97) aVar.u, j);
        if (SessionManager.getInstance().perfSession().v) {
            this.u.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().u);
        }
    }

    public final void m(String str) {
        f55 f55VarA;
        int iLastIndexOf;
        if (str != null) {
            f55 f55VarA2 = null;
            try {
                f55.a aVar = new f55.a();
                aVar.d(null, str);
                f55VarA = aVar.a();
            } catch (IllegalArgumentException unused) {
                f55VarA = null;
            }
            if (f55VarA != null) {
                f55.a aVarG = f55VarA.g();
                aVarG.b = utb.a(0, 0, 123, BuildConfig.FLAVOR, " \"':;<=>@[]^`{}|/\\?#");
                aVarG.c = utb.a(0, 0, 123, BuildConfig.FLAVOR, " \"':;<=>@[]^`{}|/\\?#");
                aVarG.g = null;
                aVarG.h = null;
                str = aVarG.toString();
            }
            if (str.length() > 2000) {
                if (str.charAt(2000) == '/') {
                    str = str.substring(0, 2000);
                } else {
                    try {
                        f55.a aVar2 = new f55.a();
                        aVar2.d(null, str);
                        f55VarA2 = aVar2.a();
                    } catch (IllegalArgumentException unused2) {
                    }
                    str = (f55VarA2 != null && f55VarA2.b().lastIndexOf(47) >= 0 && (iLastIndexOf = str.lastIndexOf(47, 1999)) >= 0) ? str.substring(0, iLastIndexOf) : str.substring(0, 2000);
                }
            }
            z97.a aVar3 = this.w;
            aVar3.n();
            z97.y((z97) aVar3.u, str);
        }
    }
}
