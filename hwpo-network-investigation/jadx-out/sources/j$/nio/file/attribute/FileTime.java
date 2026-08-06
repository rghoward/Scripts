package j$.nio.file.attribute;

import com.intercom.twig.BuildConfig;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class FileTime implements Comparable<FileTime> {
    public final long a;
    public Instant b = null;
    public String c;

    public FileTime(long j) {
        this.a = j;
    }

    public static long L(long j, long j2, long j3) {
        if (j > j3) {
            return Long.MAX_VALUE;
        }
        if (j < (-j3)) {
            return Long.MIN_VALUE;
        }
        return j * j2;
    }

    public static void z(StringBuilder sb, int i, int i2) {
        while (i > 0) {
            sb.append((char) ((i2 / i) + 48));
            i2 %= i;
            i /= 10;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final int compareTo(FileTime fileTime) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (timeUnit != null) {
            fileTime.getClass();
            return Long.compare(this.a, fileTime.a);
        }
        long epochSecond = toInstant().getEpochSecond();
        int iCompare = Long.compare(epochSecond, fileTime.toInstant().getEpochSecond());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Long.compare(toInstant().getNano(), fileTime.toInstant().getNano());
        if (iCompare2 != 0) {
            return iCompare2;
        }
        if (epochSecond != 31556889864403199L && epochSecond != -31557014167219200L) {
            return 0;
        }
        long epochSecond2 = timeUnit != null ? this.a / 86400000 : toInstant().getEpochSecond() / 86400;
        long epochSecond3 = timeUnit != null ? fileTime.a / 86400000 : fileTime.toInstant().getEpochSecond() / 86400;
        return epochSecond2 == epochSecond3 ? Long.compare(O(epochSecond2), fileTime.O(epochSecond3)) : Long.compare(epochSecond2, epochSecond3);
    }

    public final long O(long j) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        if (timeUnit2 != null) {
            return timeUnit2.toNanos(this.a - timeUnit2.convert(j, timeUnit));
        }
        return TimeUnit.SECONDS.toNanos(toInstant().getEpochSecond() - timeUnit.toSeconds(j));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof FileTime) && compareTo((FileTime) obj) == 0;
    }

    public final int hashCode() {
        return toInstant().hashCode();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x008c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0091  */
    /* JADX WARN: Code duplicated, block: B:21:0x009a  */
    /* JADX WARN: Code duplicated, block: B:22:0x009f  */
    public final Instant toInstant() {
        long jL;
        int iFloorMod;
        long jFloorDiv;
        if (this.b == null) {
            switch (r.a[TimeUnit.MILLISECONDS.ordinal()]) {
                case 1:
                    jL = L(this.a, 86400L, 106751991167300L);
                    long j = jL;
                    iFloorMod = 0;
                    jFloorDiv = j;
                    if (jFloorDiv <= -31557014167219200L) {
                        this.b = Instant.d;
                    } else if (jFloorDiv < 31556889864403199L) {
                        this.b = Instant.ofEpochSecond(jFloorDiv, iFloorMod);
                    } else {
                        this.b = Instant.e;
                    }
                    break;
                case 2:
                    jL = L(this.a, 3600L, 2562047788015215L);
                    long j2 = jL;
                    iFloorMod = 0;
                    jFloorDiv = j2;
                    if (jFloorDiv <= -31557014167219200L) {
                        this.b = Instant.d;
                    } else if (jFloorDiv < 31556889864403199L) {
                        this.b = Instant.ofEpochSecond(jFloorDiv, iFloorMod);
                    } else {
                        this.b = Instant.e;
                    }
                    break;
                case 3:
                    jL = L(this.a, 60L, 153722867280912930L);
                    long j3 = jL;
                    iFloorMod = 0;
                    jFloorDiv = j3;
                    if (jFloorDiv <= -31557014167219200L) {
                        this.b = Instant.d;
                    } else if (jFloorDiv < 31556889864403199L) {
                        this.b = Instant.ofEpochSecond(jFloorDiv, iFloorMod);
                    } else {
                        this.b = Instant.e;
                    }
                    break;
                case 4:
                    jL = this.a;
                    long j4 = jL;
                    iFloorMod = 0;
                    jFloorDiv = j4;
                    if (jFloorDiv <= -31557014167219200L) {
                        this.b = Instant.d;
                    } else if (jFloorDiv < 31556889864403199L) {
                        this.b = Instant.ofEpochSecond(jFloorDiv, iFloorMod);
                    } else {
                        this.b = Instant.e;
                    }
                    break;
                case 5:
                    jFloorDiv = Math.floorDiv(this.a, 1000L);
                    iFloorMod = ((int) Math.floorMod(this.a, 1000L)) * 1000000;
                    if (jFloorDiv <= -31557014167219200L) {
                        this.b = Instant.d;
                    } else if (jFloorDiv < 31556889864403199L) {
                        this.b = Instant.ofEpochSecond(jFloorDiv, iFloorMod);
                    } else {
                        this.b = Instant.e;
                    }
                    break;
                case 6:
                    jFloorDiv = Math.floorDiv(this.a, 1000000L);
                    iFloorMod = ((int) Math.floorMod(this.a, 1000000L)) * 1000;
                    if (jFloorDiv <= -31557014167219200L) {
                        this.b = Instant.d;
                    } else if (jFloorDiv < 31556889864403199L) {
                        this.b = Instant.ofEpochSecond(jFloorDiv, iFloorMod);
                    } else {
                        this.b = Instant.e;
                    }
                    break;
                case 7:
                    jFloorDiv = Math.floorDiv(this.a, 1000000000L);
                    iFloorMod = (int) Math.floorMod(this.a, 1000000000L);
                    if (jFloorDiv <= -31557014167219200L) {
                        this.b = Instant.d;
                    } else if (jFloorDiv < 31556889864403199L) {
                        this.b = Instant.ofEpochSecond(jFloorDiv, iFloorMod);
                    } else {
                        this.b = Instant.e;
                    }
                    break;
                default:
                    throw new AssertionError("Unit not handled");
            }
        }
        return this.b;
    }

    public long toMillis() {
        if (TimeUnit.MILLISECONDS != null) {
            return this.a;
        }
        long epochSecond = this.b.getEpochSecond();
        int nano = this.b.getNano();
        long j = epochSecond * 1000;
        if (((Math.abs(epochSecond) | 1000) >>> 31) == 0 || j / 1000 == epochSecond) {
            return j + ((long) (nano / 1000000));
        }
        return epochSecond < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
    }

    public final String toString() {
        long epochSecond;
        int nano;
        long jFloorDiv;
        LocalDateTime localDateTimeO;
        int year;
        if (this.c == null) {
            if (this.b != null || TimeUnit.MILLISECONDS.compareTo(TimeUnit.SECONDS) < 0) {
                epochSecond = toInstant().getEpochSecond();
                nano = toInstant().getNano();
            } else {
                epochSecond = this.a / 1000;
                nano = 0;
            }
            if (epochSecond >= -62167219200L) {
                long j = epochSecond - 253402300800L;
                jFloorDiv = Math.floorDiv(j, 315569520000L) + 1;
                localDateTimeO = LocalDateTime.O(Math.floorMod(j, 315569520000L) - 62167219200L, nano, ZoneOffset.UTC);
                year = localDateTimeO.a.getYear();
            } else {
                long j2 = epochSecond + 62167219200L;
                jFloorDiv = j2 / 315569520000L;
                localDateTimeO = LocalDateTime.O((j2 % 315569520000L) - 62167219200L, nano, ZoneOffset.UTC);
                year = localDateTimeO.a.getYear();
            }
            int i = (((int) jFloorDiv) * 10000) + year;
            if (i <= 0) {
                i--;
            }
            int nano2 = localDateTimeO.b.getNano();
            StringBuilder sb = new StringBuilder(64);
            sb.append(i < 0 ? "-" : BuildConfig.FLAVOR);
            int iAbs = Math.abs(i);
            if (iAbs < 10000) {
                z(sb, 1000, Math.abs(iAbs));
            } else {
                sb.append(String.valueOf(iAbs));
            }
            sb.append('-');
            z(sb, 10, localDateTimeO.a.getMonthValue());
            sb.append('-');
            z(sb, 10, localDateTimeO.a.getDayOfMonth());
            sb.append('T');
            z(sb, 10, localDateTimeO.b.getHour());
            sb.append(':');
            z(sb, 10, localDateTimeO.b.getMinute());
            sb.append(':');
            z(sb, 10, localDateTimeO.b.getSecond());
            if (nano2 != 0) {
                sb.append('.');
                int i2 = 100000000;
                while (nano2 % 10 == 0) {
                    nano2 /= 10;
                    i2 /= 10;
                }
                z(sb, i2, nano2);
            }
            sb.append('Z');
            this.c = sb.toString();
        }
        return this.c;
    }
}
