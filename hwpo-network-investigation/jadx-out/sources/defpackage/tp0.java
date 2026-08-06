package defpackage;

import io.ably.lib.util.Crypto;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tp0 {
    public static final String b;
    public static final String c;
    public static final tp0 d;
    public static final tp0 e;
    public final boolean a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public static final byte[] e = new byte[1792];
        public final String a;
        public final int b;
        public int c;
        public char d;

        static {
            for (int i = 0; i < 1792; i++) {
                e[i] = Character.getDirectionality(i);
            }
        }

        public a(String str) {
            this.a = str;
            this.b = str.length();
        }

        public final byte a() {
            int i = this.c - 1;
            String str = this.a;
            char cCharAt = str.charAt(i);
            this.d = cCharAt;
            boolean zIsLowSurrogate = Character.isLowSurrogate(cCharAt);
            int i2 = this.c;
            if (zIsLowSurrogate) {
                int iCodePointBefore = Character.codePointBefore(str, i2);
                this.c -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.c = i2 - 1;
            char c = this.d;
            return c < 1792 ? e[c] : Character.getDirectionality(c);
        }
    }

    static {
        kda.d dVar = kda.c;
        b = Character.toString((char) 8206);
        c = Character.toString((char) 8207);
        d = new tp0(false);
        e = new tp0(true);
    }

    public tp0(boolean z) {
        kda.d dVar = kda.a;
        this.a = z;
    }

    public static int a(String str) {
        byte directionality;
        a aVar = new a(str);
        aVar.c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = aVar.c;
            if (i4 < aVar.b && i == 0) {
                String str2 = aVar.a;
                char cCharAt = str2.charAt(i4);
                aVar.d = cCharAt;
                boolean zIsHighSurrogate = Character.isHighSurrogate(cCharAt);
                int i5 = aVar.c;
                if (zIsHighSurrogate) {
                    int iCodePointAt = Character.codePointAt(str2, i5);
                    aVar.c = Character.charCount(iCodePointAt) + aVar.c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    aVar.c = i5 + 1;
                    char c2 = aVar.d;
                    directionality = c2 < 1792 ? a.e[c2] : Character.getDirectionality(c2);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case h4c.e /* 15 */:
                                i3++;
                                i2 = -1;
                                continue;
                            case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i != 0) {
            if (i2 == 0) {
                while (aVar.c > 0) {
                    switch (aVar.a()) {
                        case 14:
                        case h4c.e /* 15 */:
                            if (i == i3) {
                                return -1;
                            }
                            i3--;
                            break;
                        case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                        case 17:
                            if (i == i3) {
                                return 1;
                            }
                            i3--;
                            break;
                        case 18:
                            i3++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i2;
            }
        }
        return 0;
    }

    public static int b(String str) {
        a aVar = new a(str);
        aVar.c = aVar.b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (aVar.c > 0) {
                byte bA = aVar.a();
                if (bA == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case 14:
                        case h4c.e /* 15 */:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                        case 17:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }
}
