package defpackage;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ds9 implements su6.a {
    public final ArrayList a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final long a;
        public final long b;
        public final int c;

        public a(long j, int i, long j2) {
            xl7.g(j < j2);
            this.a = j;
            this.b = j2;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
        }

        public final String toString() {
            String str = n6b.a;
            Locale locale = Locale.US;
            StringBuilder sbB = ao3.b("Segment: startTimeMs=", this.a, ", endTimeMs=");
            sbB.append(this.b);
            sbB.append(", speedDivisor=");
            sbB.append(this.c);
            return sbB.toString();
        }
    }

    public ds9(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((a) arrayList.get(0)).b;
            for (int i = 1; i < arrayList.size(); i++) {
                if (((a) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                }
                j = ((a) arrayList.get(i)).b;
            }
        }
        xl7.g(!z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ds9.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ds9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }
}
