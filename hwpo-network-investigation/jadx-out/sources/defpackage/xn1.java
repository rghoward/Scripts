package defpackage;

import android.text.SpannedString;
import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.comments.presentation.CommentsViewModel$observeComments$1", f = "CommentsViewModel.kt", l = {404}, m = "invokeSuspend", v = 2)
public final class xn1 extends p6a implements ci4<xd3<? extends Exception, ? extends List<? extends gk1>>, r02<? super g2b>, Object> {
    public qn1 t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ qn1 w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends pi4 implements oh4<List<? extends gk1>, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(List<? extends gk1> list) {
            Object next;
            char c;
            v23 aVar;
            List<? extends gk1> list2 = list;
            list2.getClass();
            qn1 qn1Var = (qn1) this.receiver;
            bu8 bu8Var = qn1Var.P;
            Iterator<T> it = qn1Var.b().e.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((v23) next) instanceof nm1));
            Object nm1Var = (v23) next;
            if (nm1Var == null) {
                am1.b bVar = qn1Var.R;
                if (bVar instanceof am1.b.a) {
                    am1.b.a aVar2 = (am1.b.a) bVar;
                    String str = aVar2.v;
                    String str2 = aVar2.w;
                    int iA = bu8Var.a(R.color.light_taupe);
                    int i = aVar2.x;
                    str.getClass();
                    String strB = bu8Var.b(R.string.comment_header_result, str);
                    Integer numValueOf = Integer.valueOf(i);
                    if (i <= 0) {
                        numValueOf = null;
                    }
                    nm1Var = new nm1(strB, str2, iA, numValueOf);
                } else {
                    if (!(bVar instanceof am1.b.C0003b)) {
                        u.b();
                        return null;
                    }
                    nm1Var = null;
                }
            }
            h5b h5bVar = qn1Var.T;
            if (h5bVar == null) {
                xj5.e("currentUser");
                throw null;
            }
            int i2 = h5bVar.a;
            String strB2 = bu8Var.b(R.string.leaderboard_group_mention, new Object[0]);
            int iA2 = bu8Var.a(R.color.light_taupe);
            int iA3 = bu8Var.a(R.color.labelBlue);
            DateTimeFormatter dateTimeFormatterWithLocale = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.getDefault());
            ArrayList arrayList = new ArrayList(ph1.n(list2, 10));
            for (gk1 gk1Var : list2) {
                dateTimeFormatterWithLocale.getClass();
                gk1Var.getClass();
                ps6 ps6Var = gk1Var.g;
                String str3 = ps6Var.b;
                List<gr6> list3 = gk1Var.h;
                String str4 = gk1Var.c;
                String str5 = gk1Var.f.format(dateTimeFormatterWithLocale);
                List<m89> list4 = gk1Var.i;
                if (list4.isEmpty()) {
                    str5.getClass();
                    long j = gk1Var.a;
                    SpannedString spannedStringA = lu6.a(str4 == null ? BuildConfig.FLAVOR : str4, kn1.b(i2, list3), strB2, iA2, iA3, iA2);
                    aVar = new sk1.b(j, gk1Var.e, gk1Var.d, str5, str3, ps6Var.e, String.valueOf(a3a.S(str3)), spannedStringA != null ? spannedStringA : BuildConfig.FLAVOR);
                    c = '\n';
                } else {
                    str5.getClass();
                    long j2 = gk1Var.a;
                    SpannedString spannedStringA2 = lu6.a(str4 == null ? BuildConfig.FLAVOR : str4, kn1.b(i2, list3), strB2, iA2, iA3, iA2);
                    CharSequence charSequence = spannedStringA2 != null ? spannedStringA2 : BuildConfig.FLAVOR;
                    boolean z = gk1Var.e;
                    boolean z2 = gk1Var.d;
                    String str6 = ps6Var.e;
                    String strValueOf = String.valueOf(a3a.S(str3));
                    c = '\n';
                    ArrayList arrayList2 = new ArrayList(ph1.n(list4, 10));
                    Iterator<T> it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(kn1.a((m89) it2.next()));
                    }
                    aVar = new sk1.a(j2, z, z2, str5, str3, str6, strValueOf, charSequence, arrayList2);
                }
                arrayList.add(aVar);
                nm1Var = nm1Var;
            }
            Object obj = nm1Var;
            ArrayList arrayList3 = new ArrayList(arrayList);
            if (arrayList3.isEmpty()) {
                qn1Var.e(qn1.a.h.a);
            } else {
                qn1Var.e(qn1.a.c.a);
            }
            if (obj != null) {
                arrayList3.add(0, obj);
            }
            qn1Var.e(new qn1.a.b(arrayList3));
            if (!list2.isEmpty()) {
                Iterator<T> it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (!((gk1) it3.next()).e) {
                        oy0.d(rhb.b(qn1Var), null, null, new wn1(qn1Var, null), 3);
                        break;
                    }
                }
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends pi4 implements oh4<Exception, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(Exception exc) {
            Exception exc2 = exc;
            exc2.getClass();
            qn1.g((qn1) this.receiver, exc2);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn1(qn1 qn1Var, r02<? super xn1> r02Var) {
        super(2, r02Var);
        this.w = qn1Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        xn1 xn1Var = new xn1(this.w, r02Var);
        xn1Var.v = obj;
        return xn1Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(xd3<? extends Exception, ? extends List<? extends gk1>> xd3Var, r02<? super g2b> r02Var) {
        return ((xn1) create(xd3Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        qn1 qn1Var;
        xd3 xd3Var = (xd3) this.v;
        int i = this.u;
        qn1 qn1Var2 = this.w;
        if (i == 0) {
            dv8.b(obj);
            if (qn1Var2.T == null) {
                uk4 uk4Var = qn1Var2.K;
                g2b g2bVar = g2b.a;
                this.v = xd3Var;
                this.t = qn1Var2;
                this.u = 1;
                uk4Var.getClass();
                obj = g5b.b(uk4Var, g2bVar, this);
                v72 v72Var = v72.t;
                if (obj == v72Var) {
                    return v72Var;
                }
                qn1Var = qn1Var2;
            }
            xd3Var.a(new a(1, qn1Var2, qn1.class, "onCommentsLoaded", "onCommentsLoaded(Ljava/util/List;)V", 0), new b(1, qn1Var2, qn1.class, "onError", "onError(Ljava/lang/Exception;)V", 0));
            return g2b.a;
        }
        if (i != 1) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qn1Var = this.t;
        dv8.b(obj);
        qn1Var.T = (h5b) yd3.f((xd3) obj);
        xd3Var.a(new a(1, qn1Var2, qn1.class, "onCommentsLoaded", "onCommentsLoaded(Ljava/util/List;)V", 0), new b(1, qn1Var2, qn1.class, "onError", "onError(Ljava/lang/Exception;)V", 0));
        return g2b.a;
    }
}
