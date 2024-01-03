-- 코드를 입력하세요
SELECT MONTH(start_date) as MONTH, car_id, COUNT(*) AS RECORDS 
    FROM car_rental_company_rental_history
    WHERE start_date BETWEEN '2022-08-01' AND '2022-10-31'
        AND car_id IN (
            SELECT car_id FROM car_rental_company_rental_history
                WHERE start_date BETWEEN '2022-08-01' AND '2022-10-31'
                GROUP BY car_id
                    HAVING COUNT(history_id) >= 5
        )
    GROUP BY car_id, MONTH(start_date)
        HAVING COUNT(*) > 0
    ORDER BY MONTH(start_date), car_id DESC;
