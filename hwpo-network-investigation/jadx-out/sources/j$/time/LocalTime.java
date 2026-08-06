package j$.time;

import com.intercom.twig.BuildConfig;
import defpackage.h4c;
import defpackage.z97;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.temporal.s;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class LocalTime implements j$.time.temporal.m, j$.time.temporal.n, Comparable<LocalTime>, Serializable {
    public static final LocalTime MIDNIGHT;
    public static final LocalTime e;
    public static final LocalTime f;
    public static final LocalTime[] g = new LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;
    public final byte a;
    public final byte b;
    public final byte c;
    public final int d;

    static {
        int i = 0;
        while (true) {
            LocalTime[] localTimeArr = g;
            if (i >= localTimeArr.length) {
                LocalTime localTime = localTimeArr[0];
                MIDNIGHT = localTime;
                LocalTime localTime2 = localTimeArr[12];
                e = localTime;
                f = new LocalTime(23, 59, 59, 999999999);
                return;
            }
            localTimeArr[i] = new LocalTime(i, 0, 0, 0);
            i++;
        }
    }

    public LocalTime(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    public static LocalTime E(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? g[i] : new LocalTime(i, i2, i3, i4);
    }

    public static LocalTime L(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalTime localTime = (LocalTime) temporalAccessor.d(q.g);
        if (localTime != null) {
            return localTime;
        }
        j$.nio.file.k.f("Unable to obtain LocalTime from TemporalAccessor: ", temporalAccessor, " of type ", temporalAccessor.getClass().getName());
        return null;
    }

    public static LocalTime V(long j) {
        j$.time.temporal.a.NANO_OF_DAY.e0(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return E(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    public static LocalTime i0(DataInput dataInput) throws IOException {
        int i;
        int i2;
        int i3 = dataInput.readByte();
        int i4 = 0;
        if (i3 < 0) {
            i3 = ~i3;
            i2 = 0;
            i = 0;
        } else {
            byte b = dataInput.readByte();
            if (b < 0) {
                int i5 = ~b;
                i = 0;
                i4 = i5;
                i2 = 0;
            } else {
                byte b2 = dataInput.readByte();
                if (b2 < 0) {
                    i2 = ~b2;
                    i = 0;
                    i4 = b;
                } else {
                    i = dataInput.readInt();
                    i4 = b;
                    i2 = b2;
                }
            }
        }
        return of(i3, i4, i2, i);
    }

    public static LocalTime of(int i, int i2, int i3, int i4) {
        j$.time.temporal.a.HOUR_OF_DAY.e0(i);
        j$.time.temporal.a.MINUTE_OF_HOUR.e0(i2);
        j$.time.temporal.a.SECOND_OF_MINUTE.e0(i3);
        j$.time.temporal.a.NANO_OF_SECOND.e0(i4);
        return E(i, i2, i3, i4);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 4, this);
    }

    public final int O(TemporalField temporalField) {
        switch (h.a[((j$.time.temporal.a) temporalField).ordinal()]) {
            case 1:
                return this.d;
            case 2:
                throw new s("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.d / 1000;
            case 4:
                throw new s("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.d / 1000000;
            case 6:
                return (int) (j0() / 1000000);
            case 7:
                return this.c;
            case 8:
                return k0();
            case 9:
                return this.b;
            case 10:
                return (this.a * 60) + this.b;
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return this.a % 12;
            case 12:
                int i = this.a % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return this.a;
            case 14:
                byte b = this.a;
                if (b == 0) {
                    return 24;
                }
                return b;
            case h4c.e /* 15 */:
                return this.a / 12;
            default:
                throw new s(c.a("Unsupported field: ", temporalField));
        }
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final LocalTime b(long j, r rVar) {
        if (!(rVar instanceof j$.time.temporal.b)) {
            return (LocalTime) rVar.z(this, j);
        }
        switch (h.b[((j$.time.temporal.b) rVar).ordinal()]) {
            case 1:
                return g0(j);
            case 2:
                return g0((j % 86400000000L) * 1000);
            case 3:
                return g0((j % 86400000) * 1000000);
            case 4:
                return h0(j);
            case 5:
                return f0(j);
            case 6:
                return e0(j);
            case 7:
                return e0((j % 2) * 12);
            default:
                j$.nio.file.k.d("Unsupported unit: ", rVar);
                return null;
        }
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j, r rVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, rVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(e eVar) {
        if (eVar == q.b || eVar == q.a || eVar == q.e || eVar == q.d) {
            return null;
        }
        if (eVar == q.g) {
            return this;
        }
        if (eVar == q.f) {
            return null;
        }
        return eVar == q.c ? j$.time.temporal.b.NANOS : eVar.l(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: e */
    public final j$.time.temporal.m j(LocalDate localDate) {
        return (LocalTime) localDate.f(this);
    }

    public final LocalTime e0(long j) {
        return j == 0 ? this : E(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.a == localTime.a && this.b == localTime.b && this.c == localTime.c && this.d == localTime.d) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m f(j$.time.temporal.m mVar) {
        return mVar.a(j$.time.temporal.a.NANO_OF_DAY, j0());
    }

    public final LocalTime f0(long j) {
        if (j != 0) {
            int i = (this.a * 60) + this.b;
            int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i2) {
                return E(i2 / 60, i2 % 60, this.c, this.d);
            }
        }
        return this;
    }

    public final LocalTime g0(long j) {
        if (j != 0) {
            long jJ0 = j0();
            long j2 = (((j % 86400000000000L) + jJ0) + 86400000000000L) % 86400000000000L;
            if (jJ0 != j2) {
                return E((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
            }
        }
        return this;
    }

    public int getHour() {
        return this.a;
    }

    public int getMinute() {
        return this.b;
    }

    public int getNano() {
        return this.d;
    }

    public int getSecond() {
        return this.c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(TemporalField temporalField) {
        return temporalField instanceof j$.time.temporal.a ? O(temporalField) : super.h(temporalField);
    }

    public final LocalTime h0(long j) {
        if (j != 0) {
            int i = (this.b * 60) + (this.a * 3600) + this.c;
            int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i2) {
                return E(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
            }
        }
        return this;
    }

    public final int hashCode() {
        long jJ0 = j0();
        return (int) (jJ0 ^ (jJ0 >>> 32));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean i(TemporalField temporalField) {
        if (temporalField instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) temporalField).f0();
        }
        return temporalField != null && temporalField.z(this);
    }

    public final long j0() {
        return (((long) this.c) * 1000000000) + (((long) this.b) * 60000000000L) + (((long) this.a) * 3600000000000L) + ((long) this.d);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(TemporalField temporalField) {
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return temporalField.V(this);
        }
        if (temporalField == j$.time.temporal.a.NANO_OF_DAY) {
            return j0();
        }
        return temporalField == j$.time.temporal.a.MICRO_OF_DAY ? j0() / 1000 : O(temporalField);
    }

    public final int k0() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final LocalTime a(TemporalField temporalField, long j) {
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return (LocalTime) temporalField.b0(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) temporalField;
        aVar.e0(j);
        switch (h.a[aVar.ordinal()]) {
            case 1:
                return m0((int) j);
            case 2:
                return V(j);
            case 3:
                return m0(((int) j) * 1000);
            case 4:
                return V(j * 1000);
            case 5:
                return m0(((int) j) * 1000000);
            case 6:
                return V(j * 1000000);
            case 7:
                int i = (int) j;
                if (this.c != i) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.e0(i);
                    return E(this.a, this.b, i, this.d);
                }
                return this;
            case 8:
                return h0(j - ((long) k0()));
            case 9:
                int i2 = (int) j;
                if (this.b != i2) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.e0(i2);
                    return E(this.a, i2, this.c, this.d);
                }
                return this;
            case 10:
                return f0(j - ((long) ((this.a * 60) + this.b)));
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return e0(j - ((long) (this.a % 12)));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return e0(j - ((long) (this.a % 12)));
            case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                int i3 = (int) j;
                if (this.a != i3) {
                    j$.time.temporal.a.HOUR_OF_DAY.e0(i3);
                    return E(i3, this.b, this.c, this.d);
                }
                return this;
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i4 = (int) j;
                if (this.a != i4) {
                    j$.time.temporal.a.HOUR_OF_DAY.e0(i4);
                    return E(i4, this.b, this.c, this.d);
                }
                return this;
            case h4c.e /* 15 */:
                return e0((j - ((long) (this.a / 12))) * 12);
            default:
                throw new s(c.a("Unsupported field: ", temporalField));
        }
    }

    public final LocalTime m0(int i) {
        if (this.d == i) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.e0(i);
        return E(this.a, this.b, this.c, i);
    }

    public final void n0(DataOutput dataOutput) throws IOException {
        if (this.d != 0) {
            dataOutput.writeByte(this.a);
            dataOutput.writeByte(this.b);
            dataOutput.writeByte(this.c);
            dataOutput.writeInt(this.d);
            return;
        }
        if (this.c != 0) {
            dataOutput.writeByte(this.a);
            dataOutput.writeByte(this.b);
            dataOutput.writeByte(~this.c);
            return;
        }
        byte b = this.b;
        byte b2 = this.a;
        if (b == 0) {
            dataOutput.writeByte(~b2);
        } else {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(~this.b);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        byte b2 = this.b;
        byte b3 = this.c;
        int i = this.d;
        sb.append(b < 10 ? "0" : BuildConfig.FLAVOR);
        sb.append((int) b);
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        if (b3 > 0 || i > 0) {
            sb.append(b3 < 10 ? ":0" : ":");
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % 1000000 == 0) {
                    sb.append(Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final int compareTo(LocalTime localTime) {
        int iCompare = Integer.compare(this.a, localTime.a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.b, localTime.b)) == 0 && (iCompare = Integer.compare(this.c, localTime.c)) == 0) ? Integer.compare(this.d, localTime.d) : iCompare;
    }
}
