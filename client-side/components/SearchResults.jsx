const SearchResults = ({ results }) => {
  if (results.length === 0) {
    return <p>No Results Found</p>;
  }

  return (
    <table className="table table-striped mt-3">
      <thead>
        <tr>
          <th>Product Name</th>
          <th>Product ID</th>
          <th>Metro Area Title</th>
          <th>Full Name</th>
          <th>Project Group ID</th>
        </tr>
      </thead>
      <tbody>
        {results.map((result, index) => (
          <tr key={index}>
          <td>{result.productName || "N/A"}</td>
          <td>{result.productId || "N/A"}</td>
          <td>{result.metroAreaTitle || "N/A"}</td>
          <td>{result.fullName || "N/A"}</td>
          <td>{result.projectGroupId || "N/A"}</td>
        </tr>
        
        ))}
      </tbody>
    </table>
  );
};
