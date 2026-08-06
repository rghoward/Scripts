package defpackage;

import com.hwpo_training_app.core.data.model.schedule.SchedulePerformanceNetworkEntity;
import com.hwpo_training_app.tracking.data.entity.ChallengeEntryDetailsNetworkEntity;
import com.hwpo_training_app.tracking.data.entity.ChartPaginationNetworkEntity;
import com.hwpo_training_app.tracking.data.entity.EntryDetailsNetworkEntity;
import com.hwpo_training_app.tracking.data.entity.ScoreInfoNetworkEntity;
import com.hwpo_training_app.tracking.data.entity.TrackedValueEntriesResponse;
import com.hwpo_training_app.tracking.data.entity.TrackedValueEntryNetworkEntity;
import com.intercom.twig.BuildConfig;
import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class tta implements sta {
    public static final a Companion = new a();
    public final rta a;
    public final p1<osa> b;
    public final p1<cbb> c;
    public final lab d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public tta(rta rtaVar, p1<osa> p1Var, p1<cbb> p1Var2, lab labVar) {
        rtaVar.getClass();
        p1Var.getClass();
        p1Var2.getClass();
        labVar.getClass();
        this.a = rtaVar;
        this.b = p1Var;
        this.c = p1Var2;
        this.d = labVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.sta
    public final Object a(int i, u02 u02Var) throws Throwable {
        hua huaVar;
        if (u02Var instanceof hua) {
            huaVar = (hua) u02Var;
            int i2 = huaVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                huaVar.v = i2 - Integer.MIN_VALUE;
            } else {
                huaVar = new hua(this, u02Var);
            }
        } else {
            huaVar = new hua(this, u02Var);
        }
        Object objJ = huaVar.t;
        int i3 = huaVar.v;
        if (i3 == 0) {
            dv8.b(objJ);
            huaVar.v = 1;
            objJ = this.a.j(i, huaVar);
            v72 v72Var = v72.t;
            if (objJ == v72Var) {
                return v72Var;
            }
        } else {
            if (i3 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objJ);
        }
        ChallengeEntryDetailsNetworkEntity challengeEntryDetailsNetworkEntity = (ChallengeEntryDetailsNetworkEntity) objJ;
        int i4 = challengeEntryDetailsNetworkEntity.t;
        int i5 = challengeEntryDetailsNetworkEntity.u;
        String str = challengeEntryDetailsNetworkEntity.v;
        bd8 bd8VarA = challengeEntryDetailsNetworkEntity.x.a();
        SchedulePerformanceNetworkEntity schedulePerformanceNetworkEntity = challengeEntryDetailsNetworkEntity.w;
        return new m61(i5, i4, str, schedulePerformanceNetworkEntity != null ? new vc8(schedulePerformanceNetworkEntity.t, schedulePerformanceNetworkEntity.u, g93.a(schedulePerformanceNetworkEntity.v)) : null, bd8VarA);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.sta
    public final Object b(ebb ebbVar, int i, String str, String str2, Number number, Number number2, String str3, Long[] lArr, u02 u02Var) throws Throwable {
        uta utaVar;
        if (u02Var instanceof uta) {
            utaVar = (uta) u02Var;
            int i2 = utaVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                utaVar.v = i2 - Integer.MIN_VALUE;
            } else {
                utaVar = new uta(this, u02Var);
            }
        } else {
            utaVar = new uta(this, u02Var);
        }
        uta utaVar2 = utaVar;
        Object objE = utaVar2.t;
        int i3 = utaVar2.v;
        if (i3 == 0) {
            dv8.b(objE);
            String str4 = ebbVar.t;
            utaVar2.v = 1;
            objE = this.a.e(str4, i, str, str2, number, number2, str3, lArr, utaVar2);
            v72 v72Var = v72.t;
            if (objE == v72Var) {
                return v72Var;
            }
        } else {
            if (i3 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objE);
        }
        ru8 ru8Var = (ru8) objE;
        if (ru8Var.a.J) {
            return g2b.a;
        }
        throw new q45(ru8Var);
    }

    @Override // defpackage.sta
    public final r54<lr7<osa>> c() {
        return this.b.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.sta
    public final Object d(int i, u02 u02Var) throws Throwable {
        jua juaVar;
        if (u02Var instanceof jua) {
            juaVar = (jua) u02Var;
            int i2 = juaVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                juaVar.w = i2 - Integer.MIN_VALUE;
            } else {
                juaVar = new jua(this, u02Var);
            }
        } else {
            juaVar = new jua(this, u02Var);
        }
        Object objM = juaVar.u;
        int i3 = juaVar.w;
        Object obj = null;
        if (i3 == 0) {
            dv8.b(objM);
            j74 j74VarC = this.b.c();
            juaVar.t = i;
            juaVar.w = 1;
            objM = yk2.m(j74VarC, juaVar);
            v72 v72Var = v72.t;
            if (objM == v72Var) {
                return v72Var;
            }
        } else {
            if (i3 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = juaVar.t;
            dv8.b(objM);
        }
        lr7 lr7Var = (lr7) objM;
        if (lr7Var == null) {
            return null;
        }
        ArrayList arrayList = lr7Var.a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            if (((osa) obj2).b() == i) {
                obj = obj2;
                break;
            }
        }
        return (osa) obj;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.sta
    public final Object e(ebb ebbVar, int i, c13 c13Var, u02 u02Var) throws Throwable {
        yta ytaVar;
        if (u02Var instanceof yta) {
            ytaVar = (yta) u02Var;
            int i2 = ytaVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ytaVar.v = i2 - Integer.MIN_VALUE;
            } else {
                ytaVar = new yta(this, u02Var);
            }
        } else {
            ytaVar = new yta(this, u02Var);
        }
        yta ytaVar2 = ytaVar;
        Object objC = ytaVar2.t;
        int i3 = ytaVar2.v;
        lab labVar = this.d;
        if (i3 == 0) {
            dv8.b(objC);
            bb1 bb1VarB = labVar.b(c13Var);
            String str = ebbVar.t;
            String str2 = ebbVar.u;
            String str3 = bb1VarB.b;
            String str4 = bb1VarB.a;
            ytaVar2.v = 1;
            objC = this.a.c(str, i, str2, str3, str4, ytaVar2);
            v72 v72Var = v72.t;
            if (objC == v72Var) {
                return v72Var;
            }
        } else {
            if (i3 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objC);
        }
        TrackedValueEntriesResponse trackedValueEntriesResponse = (TrackedValueEntriesResponse) objC;
        List<TrackedValueEntryNetworkEntity> list = trackedValueEntriesResponse.a;
        ArrayList arrayList = new ArrayList(ph1.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((TrackedValueEntryNetworkEntity) it.next()).a());
        }
        ChartPaginationNetworkEntity chartPaginationNetworkEntity = trackedValueEntriesResponse.b;
        int i4 = chartPaginationNetworkEntity.a;
        labVar.a(arrayList, chartPaginationNetworkEntity.c, chartPaginationNetworkEntity.b);
        return g2b.a;
    }

    @Override // defpackage.sta
    public final r54<lr7<cbb>> f() {
        return this.c.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.sta
    public final Object g(ebb ebbVar, int i, u02 u02Var) throws Throwable {
        wta wtaVar;
        if (u02Var instanceof wta) {
            wtaVar = (wta) u02Var;
            int i2 = wtaVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wtaVar.v = i2 - Integer.MIN_VALUE;
            } else {
                wtaVar = new wta(this, u02Var);
            }
        } else {
            wtaVar = new wta(this, u02Var);
        }
        Object objI = wtaVar.t;
        int i3 = wtaVar.v;
        if (i3 == 0) {
            dv8.b(objI);
            String str = ebbVar.t;
            wtaVar.v = 1;
            objI = this.a.i(str, i, wtaVar);
            v72 v72Var = v72.t;
            if (objI == v72Var) {
                return v72Var;
            }
        } else {
            if (i3 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objI);
        }
        ru8 ru8Var = (ru8) objI;
        if (ru8Var.a.J) {
            return g2b.a;
        }
        throw new q45(ru8Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.sta
    public final Object h(int i, u02 u02Var) throws Throwable {
        iua iuaVar;
        if (u02Var instanceof iua) {
            iuaVar = (iua) u02Var;
            int i2 = iuaVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iuaVar.v = i2 - Integer.MIN_VALUE;
            } else {
                iuaVar = new iua(this, u02Var);
            }
        } else {
            iuaVar = new iua(this, u02Var);
        }
        Object objA = iuaVar.t;
        int i3 = iuaVar.v;
        if (i3 == 0) {
            dv8.b(objA);
            iuaVar.v = 1;
            objA = this.a.a(i, iuaVar);
            v72 v72Var = v72.t;
            if (objA == v72Var) {
                return v72Var;
            }
        } else {
            if (i3 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objA);
        }
        ScoreInfoNetworkEntity scoreInfoNetworkEntity = (ScoreInfoNetworkEntity) objA;
        return new l59(scoreInfoNetworkEntity.t, scoreInfoNetworkEntity.u, scoreInfoNetworkEntity.v, scoreInfoNetworkEntity.w, g93.a(scoreInfoNetworkEntity.x));
    }

    @Override // defpackage.sta
    public final Object i(ebb ebbVar, boolean z, String str, uq8 uq8Var) throws Throwable {
        Object objC = nr1.c.c(z, str, new dua(0, this.c, p1.class, "getNextPageKey", "getNextPageKey()Ljava/lang/Integer;", 0), new eua(this, ebbVar, null), new fua(this, null), new gua(this, null), uq8Var);
        return objC == v72.t ? objC : g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.sta
    public final Object j(ebb ebbVar, int i, u02 u02Var) throws Throwable {
        kua kuaVar;
        if (u02Var instanceof kua) {
            kuaVar = (kua) u02Var;
            int i2 = kuaVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kuaVar.v = i2 - Integer.MIN_VALUE;
            } else {
                kuaVar = new kua(this, u02Var);
            }
        } else {
            kuaVar = new kua(this, u02Var);
        }
        Object objB = kuaVar.t;
        int i3 = kuaVar.v;
        if (i3 == 0) {
            dv8.b(objB);
            String str = ebbVar.t;
            kuaVar.v = 1;
            objB = this.a.b(str, i, kuaVar);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
        } else {
            if (i3 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objB);
        }
        return ((EntryDetailsNetworkEntity) objB).a();
    }

    @Override // defpackage.sta
    public final Object k(ebb ebbVar, boolean z, String str, wq8 wq8Var) throws Throwable {
        Object objC = nr1.c.c(z, str, new zta(0, this.b, p1.class, "getNextPageKey", "getNextPageKey()Ljava/lang/Integer;", 0), new aua(this, ebbVar, null), new bua(this, ebbVar, null), new cua(this, ebbVar, null), wq8Var);
        return objC == v72.t ? objC : g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.sta
    public final Object l(ebb ebbVar, int i, u02 u02Var) throws Throwable {
        vta vtaVar;
        if (u02Var instanceof vta) {
            vtaVar = (vta) u02Var;
            int i2 = vtaVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vtaVar.v = i2 - Integer.MIN_VALUE;
            } else {
                vtaVar = new vta(this, u02Var);
            }
        } else {
            vtaVar = new vta(this, u02Var);
        }
        Object objH = vtaVar.t;
        int i3 = vtaVar.v;
        if (i3 == 0) {
            dv8.b(objH);
            String str = ebbVar.t;
            vtaVar.v = 1;
            objH = this.a.h(str, i, vtaVar);
            v72 v72Var = v72.t;
            if (objH == v72Var) {
                return v72Var;
            }
        } else {
            if (i3 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objH);
        }
        ru8 ru8Var = (ru8) objH;
        if (ru8Var.a.J) {
            return g2b.a;
        }
        throw new q45(ru8Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.sta
    public final Object m(ebb ebbVar, int i, String str, String str2, Number number, Number number2, String str3, Long[] lArr, u02 u02Var) throws Throwable {
        xta xtaVar;
        if (u02Var instanceof xta) {
            xtaVar = (xta) u02Var;
            int i2 = xtaVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xtaVar.v = i2 - Integer.MIN_VALUE;
            } else {
                xtaVar = new xta(this, u02Var);
            }
        } else {
            xtaVar = new xta(this, u02Var);
        }
        Object objD = xtaVar.t;
        int i3 = xtaVar.v;
        if (i3 == 0) {
            dv8.b(objD);
            n17.a aVar = new n17.a(0);
            aVar.c(n17.f);
            aVar.a(AttributeType.DATE, str);
            aVar.a("units", str2);
            if (str3 == null) {
                str3 = BuildConfig.FLAVOR;
            }
            aVar.a("note", str3);
            aVar.a("value", number.toString());
            if (number2 != null) {
                aVar.a("second_value", number2.toString());
            }
            if (lArr.length == 0) {
                aVar.a("attachment_ids[]", BuildConfig.FLAVOR);
            } else {
                for (Long l : lArr) {
                    aVar.a("attachment_ids[]", String.valueOf(l.longValue()));
                }
            }
            String str4 = ebbVar.t;
            n17 n17VarB = aVar.b();
            xtaVar.v = 1;
            objD = this.a.d(str4, i, n17VarB, xtaVar);
            v72 v72Var = v72.t;
            if (objD == v72Var) {
                return v72Var;
            }
        } else {
            if (i3 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objD);
        }
        ru8 ru8Var = (ru8) objD;
        if (ru8Var.a.J) {
            return g2b.a;
        }
        throw new q45(ru8Var);
    }

    @Override // defpackage.sta
    public final r54<ab1> n() {
        return this.d.c();
    }
}
