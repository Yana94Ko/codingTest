-- 코드를 입력하세요
SELECT tOut.animal_id, tOut.name FROM animal_outs tOut
    JOIN animal_ins tIn
        ON tOut.animal_id = tIn.animal_id
    WHERE tOut.datetime < tIn.datetime
    ORDER BY tIn.datetime;