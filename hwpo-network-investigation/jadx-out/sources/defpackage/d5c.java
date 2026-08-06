package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d5c implements a8c {
    public final Double t;

    public d5c(Double d) {
        if (d == null) {
            this.t = Double.valueOf(Double.NaN);
        } else {
            this.t = d;
        }
    }

    @Override // defpackage.a8c
    public final String c() {
        Double d = this.t;
        if (Double.isNaN(d.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d.doubleValue())) {
            return d.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d.doubleValue());
        BigDecimal bigDecimal = bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i >= 0 || i <= -7) && (i < 0 || i >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    @Override // defpackage.a8c
    public final Double d() {
        return this.t;
    }

    @Override // defpackage.a8c
    public final Boolean e() {
        Double d = this.t;
        boolean z = false;
        if (!Double.isNaN(d.doubleValue()) && d.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d5c) {
            return this.t.equals(((d5c) obj).t);
        }
        return false;
    }

    @Override // defpackage.a8c
    public final Iterator f() {
        return null;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }

    @Override // defpackage.a8c
    public final a8c j(String str, cgc cgcVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new i8c(c());
        }
        throw new IllegalArgumentException(c() + "." + str + " is not a function.");
    }

    @Override // defpackage.a8c
    public final a8c n() {
        return new d5c(this.t);
    }

    public final String toString() {
        return c();
    }
}
