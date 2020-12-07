package medlk.med.entities;

import java.time.LocalTime;

public enum TimeMappings30M {

    T00 (LocalTime.of(0,0), LocalTime.of(0,30)),
    T01 (LocalTime.of(0,30), LocalTime.of(1,0)),
    T02 (LocalTime.of(1,0), LocalTime.of(1,30)),
    T03 (LocalTime.of(1,30), LocalTime.of(2,0)),
    T04 (LocalTime.of(2,0), LocalTime.of(2,30)),
    T05 (LocalTime.of(2,30), LocalTime.of(3,0)),
    T06 (LocalTime.of(3,0), LocalTime.of(3,30)),
    T07 (LocalTime.of(3,30), LocalTime.of(4,0)),
    T08 (LocalTime.of(4,0), LocalTime.of(4,30)),
    T09 (LocalTime.of(4,30), LocalTime.of(5,0)),
    T10 (LocalTime.of(5,0), LocalTime.of(5,30)),
    T11 (LocalTime.of(5,30), LocalTime.of(6,0)),
    T12 (LocalTime.of(6,0), LocalTime.of(6,30)),
    T13 (LocalTime.of(6,30), LocalTime.of(7,0)),
    T14 (LocalTime.of(7,0), LocalTime.of(7,30)),
    T15 (LocalTime.of(7,30), LocalTime.of(8,0)),
    T16 (LocalTime.of(8,0), LocalTime.of(8,30)),
    T17 (LocalTime.of(8,30), LocalTime.of(9,0)),
    T18 (LocalTime.of(9,0), LocalTime.of(9,30)),
    T19 (LocalTime.of(9,30), LocalTime.of(10,0)),
    T20 (LocalTime.of(10,0), LocalTime.of(10,30)),
    T21 (LocalTime.of(10,30), LocalTime.of(11,0)),
    T22 (LocalTime.of(11,0), LocalTime.of(11,30)),
    T23 (LocalTime.of(11,30), LocalTime.of(12,0)),
    T24 (LocalTime.of(12,0), LocalTime.of(12,30)),
    T25 (LocalTime.of(12,30), LocalTime.of(13,0)),
    T26 (LocalTime.of(13,0), LocalTime.of(13,30)),
    T27 (LocalTime.of(13,30), LocalTime.of(14,0)),
    T28 (LocalTime.of(14,0), LocalTime.of(14,30)),
    T29 (LocalTime.of(14,30), LocalTime.of(15,0)),
    T30 (LocalTime.of(15,0), LocalTime.of(15,30)),
    T31 (LocalTime.of(15,30), LocalTime.of(16,0)),
    T32 (LocalTime.of(16,0), LocalTime.of(16,30)),
    T33 (LocalTime.of(16,30), LocalTime.of(17,0)),
    T34 (LocalTime.of(17,0), LocalTime.of(17,30)),
    T35 (LocalTime.of(17,30), LocalTime.of(18,0)),
    T36 (LocalTime.of(18,0), LocalTime.of(18,30)),
    T37 (LocalTime.of(18,30), LocalTime.of(19,0)),
    T38 (LocalTime.of(19,0), LocalTime.of(19,30)),
    T39 (LocalTime.of(19,30), LocalTime.of(20,0)),
    T40 (LocalTime.of(20,0), LocalTime.of(20,30)),
    T41 (LocalTime.of(20,30), LocalTime.of(21,0)),
    T42 (LocalTime.of(21,0), LocalTime.of(21,30)),
    T43 (LocalTime.of(21,30), LocalTime.of(22,0)),
    T44 (LocalTime.of(22,0), LocalTime.of(22,30)),
    T45 (LocalTime.of(22,30), LocalTime.of(23,0)),
    T46 (LocalTime.of(23,0), LocalTime.of(23,30)),
    T47 (LocalTime.of(23,30), LocalTime.of(23,59));

    public LocalTime startTime;
    public LocalTime endTime;

    TimeMappings30M(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
