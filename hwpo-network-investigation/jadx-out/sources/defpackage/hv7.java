package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.intercom.twig.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hv7 implements Parcelable {
    public static final Parcelable.Creator<hv7> CREATOR = new a();
    public final String t;
    public final zoa u;
    public boolean v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Parcelable.Creator<hv7> {
        @Override // android.os.Parcelable.Creator
        public final hv7 createFromParcel(Parcel parcel) {
            return new hv7(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final hv7[] newArray(int i) {
            return new hv7[i];
        }
    }

    public hv7(Parcel parcel) {
        this.v = false;
        this.t = parcel.readString();
        this.v = parcel.readByte() != 0;
        this.u = (zoa) parcel.readParcelable(zoa.class.getClassLoader());
    }

    public static iv7[] b(List<hv7> list) {
        if (list.isEmpty()) {
            return null;
        }
        iv7[] iv7VarArr = new iv7[list.size()];
        iv7 iv7VarA = list.get(0).a();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            iv7 iv7VarA2 = list.get(i).a();
            if (z || !list.get(i).v) {
                iv7VarArr[i] = iv7VarA2;
            } else {
                iv7VarArr[0] = iv7VarA2;
                iv7VarArr[i] = iv7VarA;
                z = true;
            }
        }
        if (!z) {
            iv7VarArr[0] = iv7VarA;
        }
        return iv7VarArr;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0098  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ce  */
    public static hv7 c(String str) {
        boolean z;
        lw1 lw1Var;
        rk7<Double> rk7Var;
        rk7<Double> rk7VarB;
        double dDoubleValue;
        hv7 hv7Var = new hv7(str.replace("-", BuildConfig.FLAVOR), new oh7());
        rv1 rv1VarE = rv1.e();
        if (rv1VarE.n()) {
            double dRandom = Math.random();
            synchronized (lw1.class) {
                try {
                    if (lw1.x == null) {
                        lw1.x = new lw1();
                    }
                    lw1Var = lw1.x;
                } catch (Throwable th) {
                    throw th;
                }
            }
            rk7<Double> rk7VarH = rv1VarE.h(lw1Var);
            if (rk7VarH.b()) {
                dDoubleValue = rk7VarH.a().doubleValue() / 100.0d;
                if (!rv1.o(dDoubleValue)) {
                    rk7Var = rv1VarE.a.getDouble("fpr_vc_session_sampling_rate");
                    if (rk7Var.b() || !rv1.o(rk7Var.a().doubleValue())) {
                        rk7VarB = rv1VarE.b(lw1Var);
                        if (!rk7VarB.b() && rv1.o(rk7VarB.a().doubleValue())) {
                            dDoubleValue = rk7VarB.a().doubleValue();
                        } else if (rv1VarE.a.isLastFetchFailed()) {
                            dDoubleValue = 1.0E-5d;
                        } else {
                            dDoubleValue = 0.01d;
                        }
                    } else {
                        rv1VarE.c.e("com.google.firebase.perf.SessionSamplingRate", rk7Var.a().doubleValue());
                        dDoubleValue = rk7Var.a().doubleValue();
                    }
                }
            } else {
                rk7Var = rv1VarE.a.getDouble("fpr_vc_session_sampling_rate");
                if (rk7Var.b()) {
                    rk7VarB = rv1VarE.b(lw1Var);
                    if (!rk7VarB.b()) {
                        if (rv1VarE.a.isLastFetchFailed()) {
                            dDoubleValue = 1.0E-5d;
                        } else {
                            dDoubleValue = 0.01d;
                        }
                    } else if (rv1VarE.a.isLastFetchFailed()) {
                        dDoubleValue = 1.0E-5d;
                    } else {
                        dDoubleValue = 0.01d;
                    }
                } else {
                    rk7VarB = rv1VarE.b(lw1Var);
                    if (!rk7VarB.b()) {
                        if (rv1VarE.a.isLastFetchFailed()) {
                            dDoubleValue = 1.0E-5d;
                        } else {
                            dDoubleValue = 0.01d;
                        }
                    } else if (rv1VarE.a.isLastFetchFailed()) {
                        dDoubleValue = 1.0E-5d;
                    } else {
                        dDoubleValue = 0.01d;
                    }
                }
            }
            if (dRandom < dDoubleValue) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        hv7Var.v = z;
        return hv7Var;
    }

    public final iv7 a() {
        iv7.b bVarC = iv7.C();
        bVarC.n();
        iv7.y((iv7) bVarC.u, this.t);
        if (this.v) {
            bVarC.n();
            iv7.z((iv7) bVarC.u);
        }
        return bVarC.l();
    }

    public final boolean d() {
        iw1 iw1Var;
        long jLongValue;
        long jA = this.u.a() / 60000000;
        rv1 rv1VarE = rv1.e();
        rv1VarE.getClass();
        synchronized (iw1.class) {
            try {
                if (iw1.x == null) {
                    iw1.x = new iw1();
                }
                iw1Var = iw1.x;
            } catch (Throwable th) {
                throw th;
            }
        }
        rk7<Long> rk7VarI = rv1VarE.i(iw1Var);
        if (!rk7VarI.b() || rk7VarI.a().longValue() <= 0) {
            rk7<Long> rk7Var = rv1VarE.a.getLong("fpr_session_max_duration_min");
            if (!rk7Var.b() || rk7Var.a().longValue() <= 0) {
                rk7<Long> rk7VarC = rv1VarE.c(iw1Var);
                jLongValue = (!rk7VarC.b() || rk7VarC.a().longValue() <= 0) ? 240L : rk7VarC.a().longValue();
            } else {
                rv1VarE.c.d(rk7Var.a().longValue(), "com.google.firebase.perf.SessionsMaxDurationMinutes");
                jLongValue = rk7Var.a().longValue();
            }
        } else {
            jLongValue = rk7VarI.a().longValue();
        }
        return jA > jLongValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.t);
        parcel.writeByte(this.v ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.u, 0);
    }

    public hv7(String str, oh7 oh7Var) {
        this.v = false;
        this.t = str;
        this.u = new zoa();
    }
}
