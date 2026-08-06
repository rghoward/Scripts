package com.google.firebase.perf.session.gauges;

import android.content.Context;
import defpackage.dp;
import defpackage.er6;
import defpackage.fp;
import defpackage.gw1;
import defpackage.hv7;
import defpackage.hw1;
import defpackage.jw1;
import defpackage.kw1;
import defpackage.kxa;
import defpackage.o20;
import defpackage.o82;
import defpackage.oj4;
import defpackage.oxa;
import defpackage.p82;
import defpackage.pj4;
import defpackage.q82;
import defpackage.qj4;
import defpackage.r6b;
import defpackage.rj4;
import defpackage.rk7;
import defpackage.rv1;
import defpackage.sj4;
import defpackage.tj4;
import defpackage.ts5;
import defpackage.zoa;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private o20 applicationProcessState;
    private final rv1 configResolver;
    private final ts5<p82> cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final ts5<ScheduledExecutorService> gaugeManagerExecutor;
    private sj4 gaugeMetadataManager;
    private final ts5<er6> memoryGaugeCollector;
    private String sessionId;
    private final oxa transportManager;
    private static final dp logger = dp.d();
    private static final GaugeManager instance = new GaugeManager();

    private GaugeManager() {
        this(new ts5(new oj4()), oxa.L, rv1.e(), null, new ts5(new pj4()), new ts5(new qj4()));
    }

    private static void collectGaugeMetricOnce(p82 p82Var, final er6 er6Var, final zoa zoaVar) {
        synchronized (p82Var) {
            try {
                p82Var.b.schedule(new o82(p82Var, zoaVar, 0), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                p82.g.f("Unable to collect Cpu Metric: " + e.getMessage());
            }
        }
        synchronized (er6Var) {
            try {
                er6Var.a.schedule(new Runnable() { // from class: dr6
                    @Override // java.lang.Runnable
                    public final void run() {
                        zoa zoaVar2 = zoaVar;
                        er6 er6Var2 = er6Var;
                        fp fpVarB = er6Var2.b(zoaVar2);
                        if (fpVarB != null) {
                            er6Var2.b.add(fpVarB);
                        }
                    }
                }, 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e2) {
                er6.f.f("Unable to collect Memory Metric: " + e2.getMessage());
            }
        }
    }

    private long getCpuGaugeCollectionFrequencyMs(o20 o20Var) {
        hw1 hw1Var;
        long jLongValue;
        gw1 gw1Var;
        int iOrdinal = o20Var.ordinal();
        if (iOrdinal == 1) {
            rv1 rv1Var = this.configResolver;
            rv1Var.getClass();
            synchronized (hw1.class) {
                try {
                    if (hw1.x == null) {
                        hw1.x = new hw1();
                    }
                    hw1Var = hw1.x;
                } catch (Throwable th) {
                    throw th;
                }
            }
            rk7<Long> rk7VarI = rv1Var.i(hw1Var);
            if (rk7VarI.b() && rv1.m(rk7VarI.a().longValue())) {
                jLongValue = rk7VarI.a().longValue();
            } else {
                rk7<Long> rk7Var = rv1Var.a.getLong("fpr_session_gauge_cpu_capture_frequency_fg_ms");
                if (rk7Var.b() && rv1.m(rk7Var.a().longValue())) {
                    rv1Var.c.d(rk7Var.a().longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs");
                    jLongValue = rk7Var.a().longValue();
                } else {
                    rk7<Long> rk7VarC = rv1Var.c(hw1Var);
                    if (rk7VarC.b() && rv1.m(rk7VarC.a().longValue())) {
                        jLongValue = rk7VarC.a().longValue();
                    } else {
                        jLongValue = rv1Var.a.isLastFetchFailed() ? 300L : 100L;
                    }
                }
            }
        } else if (iOrdinal != 2) {
            jLongValue = -1;
        } else {
            rv1 rv1Var2 = this.configResolver;
            rv1Var2.getClass();
            synchronized (gw1.class) {
                try {
                    if (gw1.x == null) {
                        gw1.x = new gw1();
                    }
                    gw1Var = gw1.x;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            rk7<Long> rk7VarI2 = rv1Var2.i(gw1Var);
            if (rk7VarI2.b() && rv1.m(rk7VarI2.a().longValue())) {
                jLongValue = rk7VarI2.a().longValue();
            } else {
                rk7<Long> rk7Var2 = rv1Var2.a.getLong("fpr_session_gauge_cpu_capture_frequency_bg_ms");
                if (rk7Var2.b() && rv1.m(rk7Var2.a().longValue())) {
                    rv1Var2.c.d(rk7Var2.a().longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs");
                    jLongValue = rk7Var2.a().longValue();
                } else {
                    rk7<Long> rk7VarC2 = rv1Var2.c(gw1Var);
                    jLongValue = (rk7VarC2.b() && rv1.m(rk7VarC2.a().longValue())) ? rk7VarC2.a().longValue() : 0L;
                }
            }
        }
        dp dpVar = p82.g;
        return jLongValue <= 0 ? INVALID_GAUGE_COLLECTION_FREQUENCY : jLongValue;
    }

    private rj4 getGaugeMetadata() {
        rj4.a aVarD = rj4.D();
        int iB = r6b.b(this.gaugeMetadataManager.c.totalMem / 1024);
        aVarD.n();
        rj4.A((rj4) aVarD.u, iB);
        int iB2 = r6b.b(this.gaugeMetadataManager.a.maxMemory() / 1024);
        aVarD.n();
        rj4.y((rj4) aVarD.u, iB2);
        int iB3 = r6b.b((((long) this.gaugeMetadataManager.b.getMemoryClass()) * 1048576) / 1024);
        aVarD.n();
        rj4.z((rj4) aVarD.u, iB3);
        return aVarD.l();
    }

    public static synchronized GaugeManager getInstance() {
        return instance;
    }

    private long getMemoryGaugeCollectionFrequencyMs(o20 o20Var) {
        kw1 kw1Var;
        long jLongValue;
        jw1 jw1Var;
        int iOrdinal = o20Var.ordinal();
        if (iOrdinal == 1) {
            rv1 rv1Var = this.configResolver;
            rv1Var.getClass();
            synchronized (kw1.class) {
                try {
                    if (kw1.x == null) {
                        kw1.x = new kw1();
                    }
                    kw1Var = kw1.x;
                } catch (Throwable th) {
                    throw th;
                }
            }
            rk7<Long> rk7VarI = rv1Var.i(kw1Var);
            if (rk7VarI.b() && rv1.m(rk7VarI.a().longValue())) {
                jLongValue = rk7VarI.a().longValue();
            } else {
                rk7<Long> rk7Var = rv1Var.a.getLong("fpr_session_gauge_memory_capture_frequency_fg_ms");
                if (rk7Var.b() && rv1.m(rk7Var.a().longValue())) {
                    rv1Var.c.d(rk7Var.a().longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs");
                    jLongValue = rk7Var.a().longValue();
                } else {
                    rk7<Long> rk7VarC = rv1Var.c(kw1Var);
                    if (rk7VarC.b() && rv1.m(rk7VarC.a().longValue())) {
                        jLongValue = rk7VarC.a().longValue();
                    } else {
                        jLongValue = rv1Var.a.isLastFetchFailed() ? 300L : 100L;
                    }
                }
            }
        } else if (iOrdinal != 2) {
            jLongValue = -1;
        } else {
            rv1 rv1Var2 = this.configResolver;
            rv1Var2.getClass();
            synchronized (jw1.class) {
                try {
                    if (jw1.x == null) {
                        jw1.x = new jw1();
                    }
                    jw1Var = jw1.x;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            rk7<Long> rk7VarI2 = rv1Var2.i(jw1Var);
            if (rk7VarI2.b() && rv1.m(rk7VarI2.a().longValue())) {
                jLongValue = rk7VarI2.a().longValue();
            } else {
                rk7<Long> rk7Var2 = rv1Var2.a.getLong("fpr_session_gauge_memory_capture_frequency_bg_ms");
                if (rk7Var2.b() && rv1.m(rk7Var2.a().longValue())) {
                    rv1Var2.c.d(rk7Var2.a().longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs");
                    jLongValue = rk7Var2.a().longValue();
                } else {
                    rk7<Long> rk7VarC2 = rv1Var2.c(jw1Var);
                    jLongValue = (rk7VarC2.b() && rv1.m(rk7VarC2.a().longValue())) ? rk7VarC2.a().longValue() : 0L;
                }
            }
        }
        dp dpVar = er6.f;
        return jLongValue <= 0 ? INVALID_GAUGE_COLLECTION_FREQUENCY : jLongValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p82 lambda$new$0() {
        return new p82();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ er6 lambda$new$1() {
        return new er6();
    }

    private boolean startCollectingCpuMetrics(long j, zoa zoaVar) {
        if (j == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        p82 p82Var = this.cpuGaugeCollector.get();
        long j2 = p82Var.d;
        if (j2 == INVALID_GAUGE_COLLECTION_FREQUENCY || j2 == 0 || j <= 0) {
            return true;
        }
        ScheduledFuture scheduledFuture = p82Var.e;
        if (scheduledFuture == null) {
            p82Var.a(j, zoaVar);
            return true;
        }
        if (p82Var.f == j) {
            return true;
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            p82Var.e = null;
            p82Var.f = INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        p82Var.a(j, zoaVar);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j, zoa zoaVar) {
        if (j == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        er6 er6Var = this.memoryGaugeCollector.get();
        dp dpVar = er6.f;
        if (j <= 0) {
            er6Var.getClass();
            return true;
        }
        ScheduledFuture scheduledFuture = er6Var.d;
        if (scheduledFuture == null) {
            er6Var.a(j, zoaVar);
            return true;
        }
        if (er6Var.e == j) {
            return true;
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            er6Var.d = null;
            er6Var.e = INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        er6Var.a(j, zoaVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: syncFlush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$stopCollectingGauges$3(String str, o20 o20Var) {
        tj4.a aVarI = tj4.I();
        while (!this.cpuGaugeCollector.get().a.isEmpty()) {
            q82 q82VarPoll = this.cpuGaugeCollector.get().a.poll();
            aVarI.n();
            tj4.B((tj4) aVarI.u, q82VarPoll);
        }
        while (!this.memoryGaugeCollector.get().b.isEmpty()) {
            fp fpVarPoll = this.memoryGaugeCollector.get().b.poll();
            aVarI.n();
            tj4.z((tj4) aVarI.u, fpVarPoll);
        }
        aVarI.n();
        tj4.y((tj4) aVarI.u, str);
        oxa oxaVar = this.transportManager;
        oxaVar.B.execute(new kxa(oxaVar, aVarI.l(), o20Var));
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new sj4(context);
    }

    public boolean logGaugeMetadata(String str, o20 o20Var) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        tj4.a aVarI = tj4.I();
        aVarI.n();
        tj4.y((tj4) aVarI.u, str);
        rj4 gaugeMetadata = getGaugeMetadata();
        aVarI.n();
        tj4.A((tj4) aVarI.u, gaugeMetadata);
        tj4 tj4VarL = aVarI.l();
        oxa oxaVar = this.transportManager;
        oxaVar.B.execute(new kxa(oxaVar, tj4VarL, o20Var));
        return true;
    }

    public void startCollectingGauges(hv7 hv7Var, final o20 o20Var) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long jStartCollectingGauges = startCollectingGauges(o20Var, hv7Var.u);
        if (jStartCollectingGauges == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.f("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        final String str = hv7Var.t;
        this.sessionId = str;
        this.applicationProcessState = o20Var;
        try {
            long j = jStartCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = this.gaugeManagerExecutor.get().scheduleAtFixedRate(new Runnable() { // from class: nj4
                @Override // java.lang.Runnable
                public final void run() {
                    this.t.lambda$startCollectingGauges$2(str, o20Var);
                }
            }, j, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            logger.f("Unable to start collecting Gauges: " + e.getMessage());
        }
    }

    public void stopCollectingGauges() {
        final String str = this.sessionId;
        if (str == null) {
            return;
        }
        final o20 o20Var = this.applicationProcessState;
        p82 p82Var = this.cpuGaugeCollector.get();
        ScheduledFuture scheduledFuture = p82Var.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            p82Var.e = null;
            p82Var.f = INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        er6 er6Var = this.memoryGaugeCollector.get();
        ScheduledFuture scheduledFuture2 = er6Var.d;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            er6Var.d = null;
            er6Var.e = INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        ScheduledFuture scheduledFuture3 = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture3 != null) {
            scheduledFuture3.cancel(false);
        }
        this.gaugeManagerExecutor.get().schedule(new Runnable() { // from class: mj4
            @Override // java.lang.Runnable
            public final void run() {
                this.t.lambda$stopCollectingGauges$3(str, o20Var);
            }
        }, 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = o20.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    public GaugeManager(ts5<ScheduledExecutorService> ts5Var, oxa oxaVar, rv1 rv1Var, sj4 sj4Var, ts5<p82> ts5Var2, ts5<er6> ts5Var3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = o20.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = ts5Var;
        this.transportManager = oxaVar;
        this.configResolver = rv1Var;
        this.gaugeMetadataManager = sj4Var;
        this.cpuGaugeCollector = ts5Var2;
        this.memoryGaugeCollector = ts5Var3;
    }

    private long startCollectingGauges(o20 o20Var, zoa zoaVar) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(o20Var);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, zoaVar)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(o20Var);
        if (startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, zoaVar)) {
            return cpuGaugeCollectionFrequencyMs == INVALID_GAUGE_COLLECTION_FREQUENCY ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs);
        }
        return cpuGaugeCollectionFrequencyMs;
    }

    public void collectGaugeMetricOnce(zoa zoaVar) {
        collectGaugeMetricOnce(this.cpuGaugeCollector.get(), this.memoryGaugeCollector.get(), zoaVar);
    }
}
